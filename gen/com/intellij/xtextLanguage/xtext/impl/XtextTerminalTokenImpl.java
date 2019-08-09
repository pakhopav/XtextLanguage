// This is a generated file. Not intended for manual editing.
package com.intellij.xtextLanguage.xtext.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.xtextLanguage.xtext.psi.XtextTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.xtextLanguage.xtext.psi.*;

public class XtextTerminalTokenImpl extends ASTWrapperPsiElement implements XtextTerminalToken {

  public XtextTerminalTokenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XtextVisitor visitor) {
    visitor.visitTerminalToken(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XtextVisitor) accept((XtextVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XtextTerminalTokenElement getTerminalTokenElement() {
    return findNotNullChildByClass(XtextTerminalTokenElement.class);
  }

}
