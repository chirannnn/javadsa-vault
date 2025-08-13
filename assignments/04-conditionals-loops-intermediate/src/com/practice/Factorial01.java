// Factorial Program In Java

package com.practice;

import java.util.Scanner;

public class Factorial01 {
    public static void main(String[] args) {
        //5! = 5×4×3×2×1 = 120

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non-negative number : ");
        int num = in.nextInt();

        if(num < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else {
            long factorial = 1;
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
