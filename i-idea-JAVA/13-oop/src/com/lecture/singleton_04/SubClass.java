package com.lecture.singleton_04;

import com.lecture.access_06.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(15, "Chiran");
//        int n = obj.num;
    }
}

class SubSubClass extends SubClass {
    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(10, "Chiran");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(10, "Chiran");
//        int n = obj.num;
    }
}