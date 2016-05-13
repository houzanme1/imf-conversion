package com.netflix.imfutility.conversion.templateParameter;

import com.netflix.imfutility.xsd.conversion.SequenceType;

/**
 * A current state depending on the conversion operation type (sequence, segment, etc.).
 */
public class ContextInfo {

    public static final int DEFAULT_SEGMENT = -1;
    public static final int DEFAULT_SEQUENCE = -1;
    public static final SequenceType DEFAULT_SEQUENCE_TYPE = null;
    public static final int DEFAULT_RESOURCE = -1;

    public static ContextInfo EMPTY = new ContextInfo(
            DEFAULT_SEGMENT, DEFAULT_SEQUENCE, DEFAULT_SEQUENCE_TYPE, DEFAULT_RESOURCE);

    private final int segment;
    private final int sequence;
    private final SequenceType sequenceType;
    private final int resource;

    public ContextInfo(int segment, int sequence, SequenceType sequenceType, int resource) {
        this.segment = segment;
        this.sequence = sequence;
        this.sequenceType = sequenceType;
        this.resource = resource;
    }

    public int getSequence() {
        return sequence;
    }

    public int getSegment() {
        return segment;
    }

    public SequenceType getSequenceType() {
        return sequenceType;
    }

    public int getResource() {
        return resource;
    }

}
