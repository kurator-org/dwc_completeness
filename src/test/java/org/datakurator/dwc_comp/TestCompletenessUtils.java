/**
 * TestCompletenessUtils.java
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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mole
 *
 */
public class TestCompletenessUtils {


	/**
	 * Test method for {@link org.datakurator.dwc_comp.CompletenessUtils#isEmpty(java.lang.String)}.
	 */
	@Test
	public void testIsEmpty() {
		assertEquals(true, CompletenessUtils.isEmpty(""));
		assertEquals(true, CompletenessUtils.isEmpty(null));
		assertEquals(true, CompletenessUtils.isEmpty(" "));
		assertEquals(true, CompletenessUtils.isEmpty("    "));
		assertEquals(true, CompletenessUtils.isEmpty("    \n"));
		
		assertEquals(false, CompletenessUtils.isEmpty("NULL"));
		assertEquals(false, CompletenessUtils.isEmpty("null"));
		assertEquals(false, CompletenessUtils.isEmpty("|"));
		assertEquals(false, CompletenessUtils.isEmpty("{}"));
		assertEquals(false, CompletenessUtils.isEmpty("A"));
		assertEquals(false, CompletenessUtils.isEmpty(" A "));
		assertEquals(false, CompletenessUtils.isEmpty("1"));
	}

	/**
	 * Test method for {@link org.datakurator.dwc_comp.CompletenessUtils#hasValue(java.lang.String)}.
	 */
	@Test
	public void testHasValue() {
		assertEquals(false, CompletenessUtils.hasValue(""));
		assertEquals(false, CompletenessUtils.hasValue(null));
		assertEquals(false, CompletenessUtils.hasValue(" "));
		assertEquals(false, CompletenessUtils.hasValue("    "));
		assertEquals(false, CompletenessUtils.hasValue("    \n"));
		assertEquals(false, CompletenessUtils.hasValue("NULL"));
		assertEquals(false, CompletenessUtils.hasValue("null"));
		assertEquals(false, CompletenessUtils.hasValue("|"));
		assertEquals(false, CompletenessUtils.hasValue("||"));
		assertEquals(false, CompletenessUtils.hasValue("{}"));
		
		assertEquals(true, CompletenessUtils.hasValue("A"));
		assertEquals(true, CompletenessUtils.hasValue(" A "));
		assertEquals(true, CompletenessUtils.hasValue("1"));
		assertEquals(true, CompletenessUtils.hasValue("| |"));
		assertEquals(true, CompletenessUtils.hasValue(" | "));
		assertEquals(true, CompletenessUtils.hasValue("{ }"));
	}

}
