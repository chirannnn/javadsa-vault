// Fibonacci series

package com.practice;

import java.util.Scanner;

public class Fibonacci07 {
    public static void main(String[] args) {
        // Fibonacci - 0 1 1 2 3 5 8 13 ...

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
//        int count = 2;
//
//        if (n >= 1) System.out.print(a + " ");
//        if (n >= 2) System.out.print(b + " ");
//
//        while (count <= n){
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//            System.out.print(b + " ");
//        }

        // value mode - the number you enter is a maximum value

        System.out.print(a + " ");

        // Print until we exceed maxValue
        while (b <= n) {
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }

    }
}
