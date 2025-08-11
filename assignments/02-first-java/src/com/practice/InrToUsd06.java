// Input currency in rupees and output in USD.

package com.practice;

import java.util.Scanner;

public class InrToUsd06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rupees  (INR) : ");
        double rupee = in.nextDouble();

        double conversionRate = 82.0;
        double usd = rupee / conversionRate;

        System.out.println("Equalent amount in USD  : " + usd);
    }
}
