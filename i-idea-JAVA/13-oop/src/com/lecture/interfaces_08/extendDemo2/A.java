package com.lecture.interfaces_08.extendDemo2;

public interface A {
    // static interface methods should always have a body
    // call via the interface name
    static void  greeting() {
        System.out.println("Hey i'm from static");
    }

    default void greet() {
        System.out.println("I'm in A");
    }
}
