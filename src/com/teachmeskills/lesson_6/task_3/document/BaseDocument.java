package com.teachmeskills.lesson_6.task_3.document;

import java.util.Date;

public abstract class BaseDocument {

    String numDoc;         // номер документа
    Date dateDoc;          // дата документа

    BaseDocument() {
    }

    public BaseDocument(String numDoc, Date dateDoc) {
        this.numDoc = numDoc;
        this.dateDoc = dateDoc;
    }
}
