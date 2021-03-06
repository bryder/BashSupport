/*
 * Copyright 2010 Joachim Ansorg, mail@ansorg-it.com
 * File: StaticExpressionTest.java, Class: StaticExpressionTest
 * Last modified: 2010-07-17
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.psi.arithmetic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jansorg
 */
public class StaticExpressionTest extends AbstractArithExprTest {
    @Test
    public void testProductSimpleStaticExpression() throws Exception {
        Assert.assertTrue(configureTopArithExpression().isStatic());
    }

    @Test
    public void testSimpleStaticExpression() throws Exception {
        Assert.assertTrue(configureTopArithExpression().isStatic());
    }

    @Test
    public void testParenthesisSimpleStaticExpression() throws Exception {
        Assert.assertTrue(configureTopArithExpression().isStatic());
    }

    @Test
    public void testParenthesisProductStaticExpression() throws Exception {
        Assert.assertTrue(configureTopArithExpression().isStatic());
    }

    @Test
    public void testComplicatedStaticExpression() throws Exception {
        Assert.assertTrue(configureTopArithExpression().isStatic());
    }

    @Test
    public void testMultipleParentStaticExpression() throws Exception {
        Assert.assertTrue(configureTopArithExpression().isStatic());
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "static/";
    }
}
