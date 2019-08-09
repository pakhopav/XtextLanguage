package com.intellij.xtextLanguage.xtext.psi;

import com.intellij.xtextLanguage.xtext.XtextLanguage;


import com.intellij.psi.tree.IElementType;
        import com.intellij.xtextLanguage.xtext.XtextLanguage;
        import org.jetbrains.annotations.*;

public class XtextElementType extends IElementType {
    public XtextElementType(@NotNull @NonNls String debugName) {
        super(debugName, XtextLanguage.INSTANCE);
    }
}