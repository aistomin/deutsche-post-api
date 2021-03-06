/*
 * Copyright (c) 2021, Istomin Andrei
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.aistomin.deutsche.post.api;

/**
 * Dummy class.
 * @since 1.0
 */
public class Dummy {

    /**
     * Dummy field.
     */
    private final String field;

    /**
     * Ctor.
     * @param fld Dummy field value.
     */
    public Dummy(final String fld) {
        this.field = fld;
    }

    /**
     * Dummy method.
     *
     * @return Dummy value.
     */
    String dummy() {
        return this.field;
    }
}
