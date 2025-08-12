// Take inputs till 0 and print sum of all numbers

package com.practice;

import java.util.Scanner;

public class SumUntilZero09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.print("Enter the nums to sum (enter 0 to stop) : ");
        while (true){
            num = in.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
        }
        System.out.print("Sum of all nums : " + sum);
    }
}
