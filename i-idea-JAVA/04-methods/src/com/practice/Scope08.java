package com.practice;

public class Scope08 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Vignesh";
        {
//            int a = 67; // already initialized outside the block in the same method, hence you cannot initialize again
            a = 100; // reassign the original ref value to some other value
            System.out.println(a);
            int c = 99;
            name = "Yuva sri";
            System.out.println(name);
                // value initializedd in this block, will remain in block
        }
        int c = 900;
        a = 50;
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block

        // scoping for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println(a);
    }

    static  void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

}
