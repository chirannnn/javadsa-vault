
// Write a program to print whether a number is even or odd, also take input from the user.

package com.practice;

import java.util.Scanner;

public class OddOrEven01 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a Number : ");
         int n = in.nextInt();

         if(n % 2 == 0){ // (n & 1) == 0
             System.out.println("Number is Even");
         }else {
             System.out.println("Number is odd");
         }

    }
}
