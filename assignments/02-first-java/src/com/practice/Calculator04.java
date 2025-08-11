// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.practice;

import java.util.Scanner;

public class Calculator04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.print("Enter the operator : ");
        char op = in.next().trim().charAt(0);

        if(op == '+' || op == '-' || op == '*' || op == '/'){
            if (op == '+'){
                System.out.println(n1+n2);
            }
            else if (op == '-'){
                System.out.println(n1-n2);
            }
            else if (op == '*'){
                System.out.println(n1*n2);
            }
            else {
                if(n2 != 0){
                    double result = (double)n1/n2;
                    System.out.println(result);
                }else {
                    System.out.println("Divisible by zero is not allowed");
                }
            }
        }else {
            System.out.println("Enter a valid operator");
        }
    }
}
