/*
 * Copyright 2010-2012 JetBrains s.r.o.
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

package org.jetbrains.jet.lang.resolve.java.psi;

import com.intellij.psi.PsiClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.resolve.java.JvmAbi;
import org.jetbrains.jet.lang.resolve.java.kt.JetClassAnnotation;

/**
 * @author Stepan Koltsov
 * @author alex.tkachman
 */
public class PsiClassWrapper {

    private JetClassAnnotation jetClassAnnotation;

    @NotNull
    private final PsiClass psiClass;

    public PsiClassWrapper(@NotNull PsiClass psiClass) {
        this.psiClass = psiClass;
    }

    @NotNull
    public final PsiClass getPsiClass() {
        return psiClass;
    }
    
    @NotNull
    public final JetClassAnnotation getJetClassAnnotation() {
        if (jetClassAnnotation == null) {
            jetClassAnnotation = JetClassAnnotation.get(psiClass);
        }
        return jetClassAnnotation;
    }

    public boolean isKotlinClass() {
        return getJetClassAnnotation().isDefined() || getPsiClass().getName().equals(JvmAbi.PACKAGE_CLASS);
    }
}