package com.practice;

public class Comparison_02 {
    public static void main(String[] args) {
        String a = "Chiran";
        String b = "Chiran";
        String c = a;
//        System.out.println(a == c);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Chiran");
        String name2 = new String("Chiran");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
