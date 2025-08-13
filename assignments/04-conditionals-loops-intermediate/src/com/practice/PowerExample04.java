// Power In Java (basic exponentiation)

package com.practice;

import java.util.Scanner;

public class PowerExample04 {
    public static void main(String[] args) {
        // result = base^exponent

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base : ");
        double base = in.nextDouble();
        System.out.print("Enter the exponent : ");
        double exponent = in.nextDouble();
        double result = Math.pow(base,exponent);

        System.out.println(base + " raised to the power " + exponent + " is " + result);

    }
}
