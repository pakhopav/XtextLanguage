package com.intellij.xtextLanguage.xtext.psi.impl;

import com.intellij.psi.PsiElement;
import com.intellij.xtextLanguage.xtext.psi.*;

public class XtextPsiImplUtil {


    public static String getName(XtextParserRule element) {
        return getNameIdentifier(element).getText();

    }

    public static PsiElement setName(XtextParserRule element, String newName) {
        PsiElement oldName = getNameIdentifier(element);
        if (oldName != null) {
            XtextValidID newNamePsi = (XtextValidID) XtextElementFactory.createValidID(newName);
            oldName.getParent().getNode().replaceChild(oldName.getNode(), newNamePsi.getNode());

        }
        return element;
    }

    public static String getName(XtextEnumRule element) {
        return getNameIdentifier(element).getText();

    }

    public static PsiElement setName(XtextEnumRule element, String newName) {
        PsiElement oldName = getNameIdentifier(element);
        if (oldName != null) {
            XtextValidID newNamePsi = (XtextValidID) XtextElementFactory.createValidID(newName);
            oldName.getParent().getNode().replaceChild(oldName.getNode(), newNamePsi.getNode());

        }
        return element;
    }

    public static String getName(XtextTerminalRule element) {
        return getNameIdentifier(element).getText();

    }

    public static PsiElement setName(XtextTerminalRule element, String newName) {
        PsiElement oldName = getNameIdentifier(element);
        if (oldName != null) {
            XtextValidID newNamePsi = (XtextValidID) XtextElementFactory.createValidID(newName);
            oldName.getParent().getNode().replaceChild(oldName.getNode(), newNamePsi.getNode());

        }
        return element;
    }

    public static PsiElement getNameIdentifier(XtextParserRule element) {

        return (PsiElement) element.getNode().findChildByType(XtextTypes.RULE_NAME_AND_PARAMS).findChildByType(XtextTypes.VALID_ID).getPsi();
    }

    public static PsiElement getNameIdentifier(XtextTerminalRule element) {

        return (PsiElement) element.getNode().findChildByType(XtextTypes.VALID_ID).getPsi();
    }

    public static PsiElement getNameIdentifier(XtextEnumRule element) {

        return (PsiElement) element.getNode().findChildByType(XtextTypes.VALID_ID).getPsi();
    }


}
