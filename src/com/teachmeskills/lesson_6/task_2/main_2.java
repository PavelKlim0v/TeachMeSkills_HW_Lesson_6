package com.teachmeskills.lesson_6.task_2;

/**
 *  Задание 2. (Основное задание)
 *    Создать классы "Директор", "Рабочий", "Бухгалтер".
 * 	  Реализовать интерфейс с методом, который печатает название должности и
 * 	  имплементировать этот метод в созданные классы.
 */

public class main_2 {

    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printTitleOfPosition();
        worker.printTitleOfPosition();
        accountant.printTitleOfPosition();
    }
}
