package com.lecture.access_06;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(10, "Chiran");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}
