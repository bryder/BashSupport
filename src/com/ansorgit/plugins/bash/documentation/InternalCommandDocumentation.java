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

package com.ansorgit.plugins.bash.documentation;

import com.ansorgit.plugins.bash.lang.psi.api.command.BashCommand;
import com.intellij.psi.PsiElement;

/**
 * Provides documentation for internal commands.
 *
 * @author jansorg
 */
class InternalCommandDocumentation extends ClasspathDocSource {
    InternalCommandDocumentation() {
        super("/documentation/internal");
    }

    @Override
    String resourceNameForElement(PsiElement element) {
        return ((BashCommand) element).getReferencedCommandName();
    }

    boolean isValid(PsiElement element, PsiElement originalElement) {
        return element instanceof BashCommand && ((BashCommand) element).isInternalCommand();
    }

    public String documentationUrl(PsiElement element, PsiElement originalElement) {
        return urlForCommand(resourceNameForElement(element));
    }

    String urlForCommand(String commandName) {
        return String.format("http://ss64.com/bash/%s.html", commandName);
    }
}
