package com.intellij.xtextLanguage.xtext;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class XtextFileTypeFactory extends FileTypeFactory {
    public XtextFileTypeFactory(){
        System.out.println("dsad");
    }
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(XtextFileType.INSTANCE, "xtext");
    }

}