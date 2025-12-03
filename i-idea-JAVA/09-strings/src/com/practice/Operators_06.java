package com.practice;

import java.util.ArrayList;

public class Operators_06 {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Chiran" + new ArrayList<>());
        System.out.println("Chiran" + new Integer(66));
        String ans = new ArrayList<>() + "" + new Integer(66);
        System.out.println(ans);

        System.out.println("a" + 'b');
    }
}
