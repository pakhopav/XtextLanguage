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

public class XtextAbstractRuleImpl extends ASTWrapperPsiElement implements XtextAbstractRule {

  public XtextAbstractRuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XtextVisitor visitor) {
    visitor.visitAbstractRule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XtextVisitor) accept((XtextVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XtextEnumRule getEnumRule() {
    return findChildByClass(XtextEnumRule.class);
  }

  @Override
  @Nullable
  public XtextParserRule getParserRule() {
    return findChildByClass(XtextParserRule.class);
  }

  @Override
  @Nullable
  public XtextTerminalRule getTerminalRule() {
    return findChildByClass(XtextTerminalRule.class);
  }

}