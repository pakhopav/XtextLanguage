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

public class XtextTerminalTokenElementImpl extends ASTWrapperPsiElement implements XtextTerminalTokenElement {

  public XtextTerminalTokenElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XtextVisitor visitor) {
    visitor.visitTerminalTokenElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XtextVisitor) accept((XtextVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XtextAbstractNegatedToken getAbstractNegatedToken() {
    return findChildByClass(XtextAbstractNegatedToken.class);
  }

  @Override
  @Nullable
  public XtextCharacterRange getCharacterRange() {
    return findChildByClass(XtextCharacterRange.class);
  }

  @Override
  @Nullable
  public XtextEof getEof() {
    return findChildByClass(XtextEof.class);
  }

  @Override
  @Nullable
  public XtextParenthesizedTerminalElement getParenthesizedTerminalElement() {
    return findChildByClass(XtextParenthesizedTerminalElement.class);
  }

  @Override
  @Nullable
  public XtextTerminalRuleCall getTerminalRuleCall() {
    return findChildByClass(XtextTerminalRuleCall.class);
  }

  @Override
  @Nullable
  public XtextWildcard getWildcard() {
    return findChildByClass(XtextWildcard.class);
  }

}
