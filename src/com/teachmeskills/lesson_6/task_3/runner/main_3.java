package com.teachmeskills.lesson_6.task_3.runner;

import com.teachmeskills.lesson_6.task_3.document.ContractEmployee;
import com.teachmeskills.lesson_6.task_3.document.ContractSupplyGoods;
import com.teachmeskills.lesson_6.task_3.document.FinancialInvoice;
import com.teachmeskills.lesson_6.task_3.register.Register;

import java.util.Date;

/**
 *  Задание 3. (Дополнительное задание)
 *    Создать систему для учета документов.
 * 	  Создать класс Регистр, который будет иметь методы:
 * 	  - сохранения документа в регистре.
 * 	  - предоставление информации о документе.
 * 	  Система может работать с тремя типами документов:
 * 	  1. Контракт на поставку товаров
 * 	   Содержит поля:
 * 		 - Номер документа
 * 		 - Тип товаров
 * 		 - Количество товаров
 * 		 - Дата документа
 * 	  2. Контракт с сотрудником
 * 	   Содержит поля:
 * 		 - Номер документа
 * 		 - Дата документа
 * 		 - Дата создания документа
 * 		 - Дата окончания контракта
 * 		 - Имя сотрудника
 * 	  3. Финансовая накладная
 * 	   Содержит поля:
 * 		 - Итоговая сумма за месяц
 * 		 - Дата документа
 * 		 - Номер документа
 * 		 - Код департамета
 *
 * 	  - Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр этот
 * 	   добавляемый документ должен добавляться в массив;
 * 	  - Массив для класса регистра должен быть размером 10;
 * 	  - Для полей "Дата документа" следует использовать тип данных Date;
 */

public class main_3 {

    public static void main(String[] args) {
        // контракт на поставку товаров: (String) (Date) (String) (int)
        ContractSupplyGoods csg = new ContractSupplyGoods("ТТН №0154281",new Date(),"Бытовая техника",200);
        // контракт с сотрудником: (String) (Date) (Date) (Date) (String)
        ContractEmployee ce = new ContractEmployee("3",new Date(),new Date(),new Date(),"Иванов И.И.");
        // финансовая накладная: (String) (Date) (int) (int)
        FinancialInvoice fi = new FinancialInvoice("0154284",new Date(),5000,6);

        Register register = new Register();

        register.addDocumentInRegister(csg);
        register.addDocumentInRegister(ce);
        register.addDocumentInRegister(fi);

        System.out.println(register.showInfoAboutDoc(csg));
        System.out.println(register.showInfoAboutDoc(ce));
        System.out.println(register.showInfoAboutDoc(fi));
    }
}
