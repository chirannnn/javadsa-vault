// Subtract the Product and Sum of Digits of an Integer

package com.practice;

import java.util.Scanner;

public class SubtractProductAndSum11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int product = 1;
        int sum = 0;
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            product *= rem;
            sum += rem;
        }
        System.out.println("Result is : " + (product - sum));
    }
}
