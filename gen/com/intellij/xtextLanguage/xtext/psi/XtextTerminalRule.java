// This is a generated file. Not intended for manual editing.
package com.intellij.xtextLanguage.xtext.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XtextTerminalRule extends PsiElement {

  @NotNull
  List<XtextAnnotation> getAnnotationList();

  @NotNull
  XtextTerminalAlternatives getTerminalAlternatives();

  @Nullable
  XtextTypeRef getTypeRef();

  @NotNull
  XtextValidID getValidID();

}
