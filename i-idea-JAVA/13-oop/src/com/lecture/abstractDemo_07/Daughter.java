package com.lecture.abstractDemo_07;

public class Daughter extends Parent {

    public Daughter(int num) {
        super(num);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
