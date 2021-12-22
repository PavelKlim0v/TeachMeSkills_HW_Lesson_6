package com.teachmeskills.lesson_6.task_3.register;

import com.teachmeskills.lesson_6.task_3.document.IDocument;

public class Register implements IRegister {

    IDocument[] array = new IDocument[10];

    public Register() {
    }

//    public Register(IDocument[] array) {
//        this.array = array;
//    }

    // метод для добавления элемента в массив
    public void addDocumentInRegister(IDocument document) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                array[i] = document;
                break;
            }
        }
    }
    // метод для показа элемента массива
    public String showInfoAboutDoc(IDocument document) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == document){
                return array[i].toString();
            }
        }
        return "nothing was found";
    }
}