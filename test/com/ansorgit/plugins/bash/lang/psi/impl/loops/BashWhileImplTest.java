/*
 * Copyright (c) Joachim Ansorg, mail@ansorg-it.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.psi.impl.loops;

import com.ansorgit.plugins.bash.BashTestUtils;
import com.ansorgit.plugins.bash.LightBashCodeInsightFixtureTestCase;
import com.ansorgit.plugins.bash.lang.psi.api.loops.BashWhile;
import com.intellij.psi.PsiElement;
import org.junit.Assert;
import org.junit.Test;

public class BashWhileImplTest extends LightBashCodeInsightFixtureTestCase {
    @Test
    public void testSimpleWhile() throws Exception {
        PsiElement element = configurePsiAtCaret();

        Assert.assertTrue(element instanceof BashWhile);
        Assert.assertEquals("Expected the select keyword", "while", ((BashWhile) element).keywordElement().getText());
        Assert.assertFalse("Expected no command group", ((BashWhile) element).isCommandGroup());
    }

    @Override
    protected String getTestDataPath() {
        return BashTestUtils.getBasePath() + "/psi/loops/";
    }
}