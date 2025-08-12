// Input a number and print all factors

package com.practice;

import java.util.Scanner;

public class Factors08 {
    public static void main(String[] args) {
        /*
        12 % 3 == 0 → 3 is a factor of 12
        12 % 5 == 2 → 5 is NOT a factor of 12
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        System.out.print("Factors of " + num + " are : ");
        for (int i = 1; i <=num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
