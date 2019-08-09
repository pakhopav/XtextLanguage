// This is a generated file. Not intended for manual editing.
package com.intellij.xtextLanguage.xtext.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XtextEnumRule extends PsiElement {

  @NotNull
  List<XtextAnnotation> getAnnotationList();

  @NotNull
  XtextEnumLiterals getEnumLiterals();

  @Nullable
  XtextTypeRef getTypeRef();

  @NotNull
  XtextValidID getValidID();

  @NotNull
  PsiElement getColon();

  @NotNull
  PsiElement getEnum();

  @Nullable
  PsiElement getReturns();

  @NotNull
  PsiElement getSemicolon();

}
