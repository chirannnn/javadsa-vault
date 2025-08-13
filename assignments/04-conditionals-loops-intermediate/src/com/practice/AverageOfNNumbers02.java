//  Calculate Average Of N Numbers

package com.practice;

import java.util.Scanner;

public class AverageOfNNumbers02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to average? ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        double sum = 0;
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            double num = in.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.println("Average of the entered numbers is: " + average);
    }
}
