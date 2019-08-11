package com.intellij.xtextLanguage.xtext.psi;


import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.xtextLanguage.xtext.XtextFileType;

public class XtextElementFactory {
    public static XtextValidID createProperty(Project project, String name) {
        final XtextFile file = createFile(project, name);
        return (XtextValidID) file.getFirstChild();
    }

    public static XtextFile createFile(Project project, String text) {
        String name = "newFile";
        return (XtextFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, XtextFileType.INSTANCE, text);
    }
}