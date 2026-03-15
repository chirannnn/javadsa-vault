package com.lecture.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;


        final A chiran = new A("Chiran");
        chiran.name = "Chirannn";

        // when a non primitive is final, you cannot reassign it.
//        chiran = new A("new Object");

        A obj = new A("new object");

        System.out.println(obj);

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

    }

    static void swap(int a, int b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}


class A {
    final int num = 10;
    String name;

    public A (String name) {
//        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}