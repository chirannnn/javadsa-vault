package com.lecture.interfaces_08.extendDemo2;

public interface B extends A {
    void greet();

    default void fun() {
        System.out.println("I'm in A");
    }

//    void fun();
}
