// Perimeter Of Circle

package com.practice;

import java.util.Scanner;

public class PerimeterOfCircle04 {
    public static void main(String[] args) {
        // Perimeter = 2 × π × r

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        double r = in.nextDouble();
        double perimeter = 2 * 3.14 * r;
        System.out.println("Perimeter of circle is : " + perimeter);
    }
}
