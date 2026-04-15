package com.lecture.abstractDemo_07;

public abstract class Parent2{

    int num;
    final int VALUE;

    public Parent2(int num) {
        this.num = num;
        VALUE = 23;
    }

    static void hello() {
        System.out.println("Heyy");
    }

    void normal() {
        System.out.println("This is normal method");
    }

    abstract void career();
    abstract void partner();
}
