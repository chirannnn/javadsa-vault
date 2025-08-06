package com.first;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entter a Temp in C : ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
