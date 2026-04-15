package com.lecture.abstractDemo_07;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career();

        Daughter daughter = new Daughter(34);
        daughter.career();

        Parent.hello();

//        Parent mom = new Parent(24);
    }
}
