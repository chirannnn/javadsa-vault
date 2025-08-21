package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);

//        System.out.println(list.contains(7));
//        System.out.println(list);
//
//        list.set(0, 0);
//        list.remove(2);
//
//        System.out.println(list);


        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get items at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);



    }
}
