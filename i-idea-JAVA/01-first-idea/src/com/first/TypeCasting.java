package com.first;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // Type casting
        int num = (int) (67.54f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c; // or byte d = (byte) ((a * b) / c);
//        System.out.println(d);

//        byte b = 50;
//        b = (byte) (b * 2); //  b = b * 2 means b * 2 is a arithmetic operation, it converts to an int
//        System.out.println(b);

//        int number = 'A';
//        System.out.println(number);
//
//        System.out.println("你好");
//
//        System.out.println(3 * 6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
