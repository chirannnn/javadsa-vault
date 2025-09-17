// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.practice;

import java.util.Scanner;

public class SimpleInterest03 {
    public static void main(String[] args) {

        // Simple Interest = P * T * R / 100

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Principal (Amount of loan) : ");
        float p = in.nextFloat();

        System.out.print("Enter the time (year) : ");
        float t = in.nextFloat();

        System.out.print("Enter the rate (percentage) : ");
        float r = in.nextFloat();

        float simpleInterest = p * t * r / 100;
        System.out.println("Simple Interest is : " + simpleInterest);

    }
}
