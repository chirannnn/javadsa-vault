package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 4;
        arr[2] = 67;
        arr[3] = 29;
        arr[4] = 5;
        // [23, 4, 67, 29, 5]
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int num : arr){
//            System.out.print(num + " "); // here num represents elements of the array
//        }

//        System.out.println(arr[5]); // index out of bound

        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Chirannn";

        System.out.println(Arrays.toString(str));

    }
}
