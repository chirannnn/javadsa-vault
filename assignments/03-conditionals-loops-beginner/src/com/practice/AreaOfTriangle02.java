// Area Of Triangle

package com.practice;

import java.util.Scanner;

public class AreaOfTriangle02 {
    public static void main(String[] args) {

        // Area = (base × height) / 2

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of triangle : ");
        double base = in.nextDouble();
        System.out.print("Enter the height of triangle : ");
        double height = in.nextDouble();

        double area = base * height / 2;
        System.out.println("Area of triangle : " + area);
    }
}
