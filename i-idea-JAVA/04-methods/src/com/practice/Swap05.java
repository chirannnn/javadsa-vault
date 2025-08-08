package com.practice;

import static java.util.Collections.swap;

public class Swap05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Vignesh";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "Deva"; // creating a new object
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function only
    }


}
