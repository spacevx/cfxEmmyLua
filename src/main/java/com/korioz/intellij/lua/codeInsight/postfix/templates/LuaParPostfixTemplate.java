/*
 * Copyright (c) 2022. Korioz(45950144+Korioz@users.noreply.github.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.korioz.intellij.lua.codeInsight.postfix.templates;

import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.psi.PsiElement;
import com.korioz.intellij.lua.codeInsight.postfix.LuaPostfixUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.korioz.intellij.lua.codeInsight.postfix.LuaPostfixUtils.selectorAllExpressionsWithCurrentOffset;

/**
 * expr -> (expr)
 * Created by Korioz on 2017/4/25.
 */
public class LuaParPostfixTemplate extends StringBasedPostfixTemplate {
    public LuaParPostfixTemplate() {
        super("par", "(expr)", selectorAllExpressionsWithCurrentOffset(LuaPostfixUtils.IS_NON_PAR));
    }

    @Nullable
    @Override
    public String getTemplateString(@NotNull PsiElement psiElement) {
        return "($expr$)$END$";
    }

    @Override
    protected PsiElement getElementToRemove(PsiElement expr) {
        return expr;
    }
}