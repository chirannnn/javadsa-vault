// Sum Of A Digits Of Number

package com.practice;

import java.util.Scanner;

public class SumOfDigits12 {
    public static void main(String[] args) {
        /*
         n = 123
         digits - 1,2,3
         sum = 1 + 2 + 3 = 6
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            sum += rem;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
