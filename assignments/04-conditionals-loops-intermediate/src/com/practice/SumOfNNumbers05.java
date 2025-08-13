// Sum Of N Numbers

package com.practice;

import java.util.Scanner;

public class SumOfNNumbers05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.print("How many numbers do you want to sum ? ");
        int N = in.nextInt();
        System.out.println("Enter " + N + " Numbers");
        for (int i = 0; i < N;i++){
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("Sum of total Num is " + sum);
    }
}
