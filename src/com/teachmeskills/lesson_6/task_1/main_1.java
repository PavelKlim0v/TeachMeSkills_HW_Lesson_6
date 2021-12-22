package com.teachmeskills.lesson_6.task_1;

/**
 *  Задание 1. (Основное задание)
 *    Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
 * 	  Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
 * 	  Создать массив из 5 фигур.
 * 	  Вывести на экран сумму периметра всех фигур в массиве.
 */

public class main_1 {

    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Rectangle(2, 3);
        figure[1] = new Triangle(4, 5, 6);
        figure[2] = new Circle(7);
        figure[3] = new Circle(8);
        figure[4] = new Circle(9);

        for (Figure fig: figure) {
            System.out.println(fig.getName() + ": perimeter = " + fig.getPerimeter());
        }
    }
}
