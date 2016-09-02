/*
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
package com.netflix.imfutility.itunes.metadata;

import com.netflix.imfutility.itunes.ITunesPackageType;

/**
 * Metadata descriptor for correct schema validation, marshalling and unmarshalling.
 *
 * @param <T> root element class.
 */
public interface MetadataDescriptor<T> {

    Class<T> getMetadataClass();

    String getMetadataSchema();

    String getMetadataPackage();

    String getMetadataNamespace();

    String getMetadataRoot();

    ITunesPackageType getPackageType();
}
