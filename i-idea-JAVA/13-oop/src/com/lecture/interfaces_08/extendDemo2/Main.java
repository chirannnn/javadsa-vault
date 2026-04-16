package com.lecture.interfaces_08.extendDemo2;

public class Main implements B{

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
