package com.teachmeskills.lesson_6.task_3.document;

import java.util.Date;

public class FinancialInvoice extends BaseDocument implements IDocument {    // финансовая накладная

    int totalAmountForMonth;       // итоговая сумма за месяц
    int departamentCode;           // код департамента

    public FinancialInvoice(String numDoc, Date dateDoc, int totalAmountForMonth, int departamentCode) {
        super(numDoc, dateDoc);
        this.totalAmountForMonth = totalAmountForMonth;
        this.departamentCode = departamentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice:" +
                "\n  numDoc = " + numDoc +
                ",\n  dateDoc = " + dateDoc +
                ",\n  totalAmountForMonth = " + totalAmountForMonth +
                ",\n  departamentCode = " + departamentCode;
    }
}
