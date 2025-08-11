// To calculate Fibonacci Series up to n numbers.

package com.practice;

import java.util.Scanner;

public class Fibonacci07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        while (count <= n){
             int temp = b;
             b = a + b;
             a = temp;
             count++;
             System.out.print(b + " ");
         }

    }
}
