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

public class XtextParenthesizedTerminalElementImpl extends ASTWrapperPsiElement implements XtextParenthesizedTerminalElement {

  public XtextParenthesizedTerminalElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XtextVisitor visitor) {
    visitor.visitParenthesizedTerminalElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XtextVisitor) accept((XtextVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XtextTerminalAlternatives getTerminalAlternatives() {
    return findNotNullChildByClass(XtextTerminalAlternatives.class);
  }

  @Override
  @NotNull
  public PsiElement getLBracket() {
    return findNotNullChildByType(L_BRACKET);
  }

  @Override
  @NotNull
  public PsiElement getRBracket() {
    return findNotNullChildByType(R_BRACKET);
  }

}
