/*
 * Copyright (c) 2016, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.yasson.internal.serializer;

import jakarta.json.bind.serializer.JsonbSerializer;

import org.eclipse.yasson.internal.model.JsonbPropertyInfo;

/**
 * Provides container serializer instance.
 */
public interface ContainerSerializerProvider {

    /**
     * Provides container serializer instance for given property.
     *
     * @param propertyInfo Property to create serializer for.
     * @return Serializer instance.
     */
    JsonbSerializer<?> provideSerializer(JsonbPropertyInfo propertyInfo);
}
