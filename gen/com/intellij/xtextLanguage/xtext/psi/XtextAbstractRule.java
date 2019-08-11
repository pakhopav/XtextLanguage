// This is a generated file. Not intended for manual editing.
package com.intellij.xtextLanguage.xtext.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XtextAbstractRule extends XtextNamedElement {

  @Nullable
  XtextEnumRule getEnumRule();

  @Nullable
  XtextParserRule getParserRule();

  @Nullable
  XtextTerminalRule getTerminalRule();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
