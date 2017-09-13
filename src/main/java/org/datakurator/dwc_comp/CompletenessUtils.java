/**
 * CompletenessUtils.java
 * 
 * Copyright 2017 President and Fellows of Harvard College
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
package org.datakurator.dwc_comp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author mole
 *
 */
public class CompletenessUtils {
	
	private static final Log logger = LogFactory.getLog(CompletenessUtils.class);
	
	/**
	 * Test strings for emptyness.
	 * 
	 * @param aString to check for emptyness
	 * @return true if string is null, is an empty string, or contains only white space, false otherwise.
	 */
    public static boolean isEmpty(String aString)  {
    	boolean result = true;
    	if (aString != null && aString.trim().length()>0) { 
    		   result = false;
    	}
    	return result;
    }
    
    /**
     * Test to see if a string contains any non-empty value, where certain
     *  string representations of null are regarded as empty.
     *   
     * @param aString to test for any non-empty value
     * @return false if string is null, is an empty string, contains only whitespace, 
     *    is a case insentitive exact match on the string 'NULL', is an exact match
     *    on the string '\N', is an exact match on the string '{}', or contains 
     *    only pipe characters. 
     */
    public static boolean hasValue(String aString) { 
    	boolean result = true;
    	if (isEmpty(aString)) { 
    		result = false;
    	} else { 
    		if (
    			aString.trim().toUpperCase().equals("NULL") ||
    			aString.trim().equals("\\N") ||
    	    	aString.matches("^[|]+$") ||
    	    	aString.trim().equals("{}")
    			) 
    		{ 
    		result = false;
    		}
    	}
    	return result;
    }	

}