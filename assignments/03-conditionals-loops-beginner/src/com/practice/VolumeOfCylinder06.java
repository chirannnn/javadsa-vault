// Volume Of Cylinder

package com.practice;

import java.util.Scanner;

public class VolumeOfCylinder06 {
    public static void main(String[] args) {
        // Volume = π × r² × h

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();
        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.println("Volume of cylinder is : " + volume) ;
    }
}
