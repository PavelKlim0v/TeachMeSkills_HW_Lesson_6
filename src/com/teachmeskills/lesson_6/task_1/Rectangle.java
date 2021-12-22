package com.teachmeskills.lesson_6.task_1;

public class Rectangle extends Figure {

    String nameRectangle = "Rectangle";
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return this.nameRectangle;
    }

    public double getPerimeter() {              //периметр прямоугольника
        double perimeter = (width + height) * 2;
        return perimeter;
    }

    public double getArea(){            //площадь прямоугольника
        double area = width * height;
        return area;
    }
}
