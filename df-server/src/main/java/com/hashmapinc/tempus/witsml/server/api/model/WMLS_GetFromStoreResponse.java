/**
 * Copyright © 2018-2018 Hashmap, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hashmapinc.tempus.witsml.server.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="WMLS_GetFromStoreResponse)")
public class WMLS_GetFromStoreResponse {
    private Short Result;
    private String XMLout;
    private String SuppMsgOut;

    public Short getResult() {
        return Result;
    }

    public void setResult(Short result) {
        Result = result;
    }

    public String getXMLout() {
        return XMLout;
    }

    public void setXMLout(String XMLout) {
        this.XMLout = XMLout;
    }

    public String getSuppMsgOut() {
        return SuppMsgOut;
    }

    public void setSuppMsgOut(String suppMsgOut) {
        SuppMsgOut = suppMsgOut;
    }
}