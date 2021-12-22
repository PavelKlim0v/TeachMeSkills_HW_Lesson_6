package com.teachmeskills.lesson_6.task_2;

public class Accountant implements ITitleOfPosition {

    String position;

    public Accountant() {
        this.position = "Accountant";
    }

    @Override
    public String printTitleOfPosition() {
        System.out.println(position);
        return this.position;
    }
}
