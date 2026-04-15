package com.lecture.abstractDemo_07;

public abstract class Parent {

    int num;
    final int VALUE;

    public Parent(int num) {
        this.num = num;
        Parent parent = new Daughter(26);
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
