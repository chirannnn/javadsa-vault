// Area Of Circle 

package com.practice;

import java.util.Scanner;

public class AreaOfCircle01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Area = π × r × r

        System.out.print("Enter the radius : ");
        double r = in.nextDouble();
        double area = 3.14 * r * r;
        System.out.println( "Area of the circle is : " + area);
    }
}
