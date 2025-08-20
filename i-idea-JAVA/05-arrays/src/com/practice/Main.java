package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Chiranjeevi";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
//        int[] ros = new int[5];
//        // or directly
//        int[] rnos2 = {1, 2, 3, 4, 5};

        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialisation : actually here object is being created in the memory (heap)

//        System.out.println(ros[1]);

        String[] str = new String[4];
        System.out.println(str[0]);

//        for (String element : str){
//            System.out.println(element);
//        }

    }
}
