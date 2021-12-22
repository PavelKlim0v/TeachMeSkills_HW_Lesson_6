package com.teachmeskills.lesson_6.task_3.document;

import java.util.Date;

public class ContractEmployee extends BaseDocument implements IDocument {    // контракт с сотрудником

    String nameEmployee;            // имя сотрудника
    Date dateStart;         // дата создания контракта
    Date dateEnd;           // дата окончания контракта

    public ContractEmployee(String numDoc, Date dateDoc, Date dateStart, Date dateEnd, String nameEmployee) {
        super(numDoc, dateDoc);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "ContractEmployee:" +
                "\n  numDoc = " + numDoc +
                ",\n  dateDoc = " + dateDoc +
                ",\n  dateStart = " + dateStart +
                ",\n  dateEnd = " + dateEnd +
                ",\n  nameEmployee = " + nameEmployee;
    }
}
