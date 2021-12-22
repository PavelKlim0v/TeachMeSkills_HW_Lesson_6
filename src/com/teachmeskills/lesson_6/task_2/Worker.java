package com.teachmeskills.lesson_6.task_2;

public class Worker implements ITitleOfPosition {

    String position;

    public Worker() {
        this.position = "Worker";
    }

    @Override
    public String printTitleOfPosition() {
        System.out.println(position);
        return this.position;
    }
}
