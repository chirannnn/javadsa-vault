// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class CircleCalculation05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a radius : ");
        double r = in.nextDouble();

        circleCal(r);
    }

    static  void circleCal(double r){
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        System.out.println("Area of circle is : " + area);
        System.out.println("Circumference of circle is : " + circumference);
    }
}
