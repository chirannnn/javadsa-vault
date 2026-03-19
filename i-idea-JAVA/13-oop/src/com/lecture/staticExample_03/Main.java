package com.lecture.staticExample_03;

public class Main {
    public static void main(String[] args) {
//        Human vasan = new Human(21, "vasan", 10000, false);
//        Human krish = new Human(24, "krish", 15000, true);
//        Human nandhu = new Human(24, "nandhu", 15000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting();
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello OOP");
    }
}
