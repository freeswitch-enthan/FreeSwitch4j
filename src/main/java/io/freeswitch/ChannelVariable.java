/*
 * Copyright 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.freeswitch;

/**
 * ChannelVariable. It helps set channel variables.
 *
 * @author Arsene Tochemey GANDOTE
 */
public class ChannelVariable {

    private String _name;
    private String _value;

    public ChannelVariable(String name, String value) {
        _name = name;
        _value = value;
    }

    @Override
    public String toString() {
        return _name + "=" + _value;
    }
}
