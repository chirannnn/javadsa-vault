/*
Write a program to print the sum of two numbers entered by user by defining your own method.

Define a method that returns the product of two numbers entered by user.
 */

import java.util.Scanner;

public class ProductAndSum04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int n1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = in.nextInt();

        sum(n1, n2);

        int product = product(n1,n2);
        System.out.println("Product of two num is " + product);
    }

    static void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum of two num is :" + sum);
    }

    static  int product(int a, int b){
        int prod = a * b;
        return  prod;
    }
}
