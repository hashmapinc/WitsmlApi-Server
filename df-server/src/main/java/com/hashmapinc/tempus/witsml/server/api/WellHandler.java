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
package com.hashmapinc.tempus.witsml.server.api;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WellHandler extends DefaultHandler {
	
	@Override
	 public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

	        if (qName.equalsIgnoreCase("well")) {
	            String uid = attributes.getValue("uid");
	            System.out.println("well UID : " + uid);
	        } else if (qName.equalsIgnoreCase("wellDatum")) {
	            String uid = attributes.getValue("uid");
	            System.out.println("WellDatum UID : " + uid);
	        } else if (qName.equalsIgnoreCase("wellLocation")) {
	            String uid = attributes.getValue("uid");
	            System.out.println("WellLocation UID : " + uid);
	        } else if(qName.equalsIgnoreCase("referencePoint")) {
	        	String uid = attributes.getValue("uid");
	        	System.out.println("refrence point is :" +uid);
	        	if(qName.equalsIgnoreCase("location"))
	        	{
	        		String luid = attributes.getValue("uid");
	        		System.out.println("Location id :" +luid);
	        		
	        	}
	        }
	    }

}
