// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package com.practice;

import java.util.Scanner;

public class SumCategories14 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sumOfNeg = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        while (true){
            System.out.print("Enter a Number (0 to stop) : ");
            int num = in.nextInt();;
            if(num == 0){
                break;
            }
            if (num < 0){
                sumOfNeg += num;
            } else if (num % 2 == 0) {
                sumOfEven += num;
            }else {
                sumOfOdd += num;
            }
        }
        System.out.println("Sum of Negative nums : " + sumOfNeg);
        System.out.println("Sum of Positive Even nums : " + sumOfEven);
        System.out.println("Sum of Positive Odd nums : " + sumOfOdd);
    }
}
