// Area Of Rectangle

package com.practice;

import java.util.Scanner;

public class AreaOfRectangle03 {
    public static void main(String[] args) {
        // Area = length × breadth (base * height)

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth of rectangle : ");
        double breadth = in.nextDouble();
        double area = length * breadth;
        System.out.println("Area of rectangle : " + area);
    }
}
