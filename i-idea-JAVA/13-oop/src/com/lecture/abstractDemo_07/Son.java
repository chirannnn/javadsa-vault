package com.lecture.abstractDemo_07;

public class Son extends Parent{

    public Son(int num) {
        super(num);
//        this.num = num;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
