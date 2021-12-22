package com.teachmeskills.lesson_6.task_1;

public class Triangle extends Figure {

    String nameTriangle = "Triangle";
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getName() {
        return this.nameTriangle;
    }

    public double getPerimeter() {              //периметр треугольника
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public double getArea() {           //площадь треугольника
        double p = (sideA + sideB + sideC) / 2;     //(полупериметр треугольника)
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));   //(формула Герона)
        return area;
    }
}
