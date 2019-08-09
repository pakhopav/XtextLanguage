package com.intellij.xtextLanguage.xtext.psi;


import com.intellij.psi.tree.IElementType;
        import com.intellij.xtextLanguage.xtext.XtextLanguage;
        import org.jetbrains.annotations.*;

public class XtextTokenType extends IElementType {
    public XtextTokenType(@NotNull @NonNls String debugName) {
        super(debugName, XtextLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "XtextTokenType." + super.toString();
    }
}