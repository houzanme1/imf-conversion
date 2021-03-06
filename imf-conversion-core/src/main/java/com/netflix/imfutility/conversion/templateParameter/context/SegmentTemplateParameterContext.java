/**
 * Copyright (C) 2016 Netflix, Inc.
 *
 *     This file is part of IMF Conversion Utility.
 *
 *     IMF Conversion Utility is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     IMF Conversion Utility is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with IMF Conversion Utility.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.netflix.imfutility.conversion.templateParameter.context;

import com.netflix.imfutility.conversion.templateParameter.ContextInfo;
import com.netflix.imfutility.conversion.templateParameter.TemplateParameter;
import com.netflix.imfutility.conversion.templateParameter.TemplateParameterContext;
import com.netflix.imfutility.conversion.templateParameter.context.parameters.SegmentContextParameters;
import com.netflix.imfutility.conversion.templateParameter.exception.TemplateParameterNotFoundException;
import com.netflix.imfutility.conversion.templateParameter.exception.UnknownTemplateParameterNameException;
import com.netflix.imfutility.cpl.uuid.SegmentUUID;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Segment Template Parameter Context.
 * <ul>
 * <li>It's used to replace segment template parameters in conversion operations</li>
 * <li>May contain any only supported segment parameters (see {@link SegmentContextParameters}</li>
 * <li>Created dynamically in the code when analyzing CPL.</li>
 * <li>Contains the following information for each segment:
 * <ul>
 * <li>Segment UUID</li>
 * <li>Segment number</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SegmentTemplateParameterContext extends AbstractTemplateParameterContext {

    private static class SegmentParameterData extends ContextParameterData<SegmentContextParameters> {
    }

    private final Map<SegmentUUID, SegmentParameterData> segments = new LinkedHashMap<>();


    /**
     * Inits a segment parameter defined by the given UUID. Defines default parameters (such as Segment UUID and number).
     * The method must be called for each segment before adding another parameters.
     *
     * @param uuid segment UUID.
     * @return this segment template parameters context.
     */
    public SegmentTemplateParameterContext initSegment(SegmentUUID uuid) {
        if (!segments.containsKey(uuid)) {
            int segmNum = segments.size();
            doAddParameter(uuid, SegmentContextParameters.UUID, uuid.getUuid());
            doAddParameter(uuid, SegmentContextParameters.NUM, String.valueOf(segmNum));
        }
        return this;
    }

    /**
     * Adds a segment parameter.
     *
     * @param uuid       segment UUID.
     * @param paramName  a enum defining the parameter name.
     * @param paramValue parameter value
     * @return this segment template parameters context.
     */
    public SegmentTemplateParameterContext addSegmentParameter(SegmentUUID uuid, SegmentContextParameters paramName, String paramValue) {
        initSegment(uuid);
        doAddParameter(uuid, paramName, paramValue);
        return this;
    }


    private void doAddParameter(SegmentUUID uuid, SegmentContextParameters paramName, String paramValue) {
        SegmentParameterData segmentData = segments.get(uuid);
        if (segmentData == null) {
            segmentData = new SegmentParameterData();
            segments.put(uuid, segmentData);
        }
        segmentData.addParameter(paramName, paramValue);
    }

    /**
     * Gets total count of segments.
     *
     * @return total count of segments.
     */
    public int getSegmentsNum() {
        return segments.size();
    }

    /**
     * Gets all Segment UUIDs. The order of the UUIDS is the order as they were added.
     *
     * @return all Segment UUIDs. The order of the UUIDS is the order as they were added.
     */
    public Collection<SegmentUUID> getUuids() {
        return segments.keySet();
    }

    /**
     * Gets resolved parameter value as a string. Never null.
     *
     * @param segmParameter a enum defining the parameter name.
     * @param contextInfo   a context info. Must  contain information about the segment.
     * @return resolved parameter value as a string. Never null.
     */
    public String getParameterValue(SegmentContextParameters segmParameter, ContextInfo contextInfo) {
        return getParameterValue(
                new TemplateParameter(TemplateParameterContext.SEGMENT, segmParameter.getName()),
                segmParameter,
                contextInfo);
    }

    /**
     * Resolves the given parameter.
     * The returned value is never null.
     * A runtime exception is thrown if parameter can not be resolved.
     *
     * @param templateParameter the template parameter to be resolved.
     * @param contextInfo       a context info. Must  contain information about the segment.
     * @return resolved parameter value as a string. Never null.
     */
    @Override
    public String resolveTemplateParameter(TemplateParameter templateParameter, ContextInfo contextInfo) {
        SegmentContextParameters segmentParameter = SegmentContextParameters.fromName(templateParameter.getName());
        if (segmentParameter == null) {
            throw new UnknownTemplateParameterNameException(
                    templateParameter.toString(),
                    String.format("Unknown Segment Template Parameter Name '%s'. Supported Segment Parameter Names: %s'",
                            templateParameter.getName(), SegmentContextParameters.getSupportedContextParameters()));
        }

        return getParameterValue(templateParameter, segmentParameter, contextInfo);
    }

    /**
     * Whether a given segment parameter is defined in the context.
     *
     * @param segmParameter parameter to check
     * @param contextInfo context Info
     * @return true if parameter is defined in the context and false otherwise.
     */
    public boolean hasSegmentParameter(SegmentContextParameters segmParameter, ContextInfo contextInfo) {
        return hasTemplateParameter(
                new TemplateParameter(TemplateParameterContext.SEGMENT, segmParameter.getName()),
                contextInfo);
    }

    private String getParameterValue(TemplateParameter templateParameter, SegmentContextParameters segmParameter, ContextInfo contextInfo) {
        if (contextInfo.getSegmentUuid() == null) {
            throw new TemplateParameterNotFoundException(
                    templateParameter.toString(),
                    "Segment UUID is not specified. Segment UUID is required for a segment template parameter.");
        }

        SegmentParameterData segmentData = segments.get(contextInfo.getSegmentUuid());
        if (segmentData == null) {
            throw new TemplateParameterNotFoundException(
                    templateParameter.toString(),
                    String.format("Segment Context for '%s' segment is not defined. Context for '%d' segments only is defined.",
                            contextInfo.getSegmentUuid(), segments.size()));
        }

        String parameterValue = segmentData.getParameterValue(segmParameter);
        if (parameterValue == null) {
            throw new TemplateParameterNotFoundException(
                    templateParameter.toString(),
                    String.format("'%s' parameter is not defined.", templateParameter.getName()));
        }
        return parameterValue;
    }


}
