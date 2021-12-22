package com.teachmeskills.lesson_6.task_2;

public class Director implements ITitleOfPosition {

    String position;

    public Director() {
        this.position = "Director";
    }

    @Override
    public String printTitleOfPosition() {
        System.out.println(position);
        return this.position;
    }
}
