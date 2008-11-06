/* $RCSfile$    
 * $Author$    
 * $Date$    
 * $Revision$
 * 
 * Copyright (C) 2004-2007  The Chemistry Development Kit (CDK) project
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA. 
 */
package org.openscience.cdk.coverage;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TestSuite that runs all the sample tests.
 *
 * @cdk.module test-qsarcml
 */
public class QsarcmlCoverageTest extends CoverageTest {

    private final static String CLASS_LIST = "qsarcml.javafiles";
    
    @BeforeClass public static void setUp() throws Exception {
        loadClassList(CLASS_LIST, QsarcmlCoverageTest.class.getClassLoader());
    }

    @Test public void testCoverage() {
        super.runCoverageTest();
    }
}
