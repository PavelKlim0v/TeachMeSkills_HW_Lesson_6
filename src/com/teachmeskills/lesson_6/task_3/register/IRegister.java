package com.teachmeskills.lesson_6.task_3.register;

import com.teachmeskills.lesson_6.task_3.document.IDocument;

public interface IRegister {

    void addDocumentInRegister(IDocument document);

    String showInfoAboutDoc(IDocument document);
}
