// Perimeter Of Rectangle

package com.practice;

import java.util.Scanner;

public class PerimeterOfRectangle05 {
    public static void main(String[] args) {
        // Perimeter = 2 × (length + breadth)

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double l = in.nextDouble();
        System.out.print("Enter the breadth : ");
        double b = in.nextDouble();
        double perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle : " + perimeter);
    }
}
