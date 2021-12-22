package com.teachmeskills.lesson_6.task_1;

public class Circle extends Figure {

    String nameCircle = "Circle";
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return this.nameCircle;
    }

    public double getPerimeter() {              //периметр круга
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getArea(){            //площадь круга
        double area = Math.PI * radius * radius;
        return area;
    }
}
