// This is a generated file. Not intended for manual editing.
package com.intellij.xtextLanguage.xtext.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XtextTerminalRule extends XtextAbstractRule {

  @NotNull
  List<XtextAnnotation> getAnnotationList();

  @NotNull
  XtextTerminalAlternatives getTerminalAlternatives();

  @Nullable
  XtextTypeRef getTypeRef();

  @NotNull
  XtextValidID getValidID();

  @NotNull
  PsiElement getColon();

  @Nullable
  PsiElement getFragment();

  @Nullable
  PsiElement getReturns();

  @NotNull
  PsiElement getSemicolon();

  @NotNull
  PsiElement getTerminal();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
