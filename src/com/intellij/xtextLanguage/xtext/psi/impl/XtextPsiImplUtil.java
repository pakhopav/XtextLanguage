package com.intellij.xtextLanguage.xtext.psi.impl;

import com.intellij.psi.PsiElement;
import com.intellij.xtextLanguage.xtext.psi.XtextAbstractRule;
import com.intellij.xtextLanguage.xtext.psi.XtextElementFactory;
import com.intellij.xtextLanguage.xtext.psi.XtextTypes;
import com.intellij.xtextLanguage.xtext.psi.XtextValidID;

public class XtextPsiImplUtil {
    public static String getName(XtextAbstractRule element) {
        return getNameIdentifier(element).getText();

    }

    public static PsiElement setName(XtextAbstractRule element, String newName) {
        PsiElement oldName = getNameIdentifier(element);
        if (oldName != null) {
            XtextValidID newNamePsi = XtextElementFactory.createProperty(element.getProject(), newName);
            oldName.getParent().getNode().replaceChild(oldName.getNode(), newNamePsi.getNode());

        }
        return element;
    }

    public static PsiElement getNameIdentifier(XtextAbstractRule element) {

        return (PsiElement) element.getFirstChild().getNode().findChildByType(XtextTypes.RULE_NAME_AND_PARAMS).findChildByType(XtextTypes.VALID_ID).getPsi();
    }


}
