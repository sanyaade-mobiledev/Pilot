/*
   Copyright (c) 2012 Emitrom LLC. All rights reserved. 
   For licensing questions, please contact us at licensing@emitrom.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.emitrom.pilot.device.client.globalization;

import com.emitrom.pilot.device.client.core.ModuleError;
import com.emitrom.pilot.util.client.core.Attributes;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class GlobalizationError extends ModuleError {
    GlobalizationError(JavaScriptObject obj) {
        super(obj);
    }

    public GlobalizationErrorCode getCode() {
        return GlobalizationErrorCode.fromValue(JsoHelper.getAttributeAsInt(jsObj, Attributes.CODE.getValue()));
    }
}