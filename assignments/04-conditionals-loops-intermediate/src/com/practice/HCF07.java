// HCF Of Two Numbers Program

package com.practice;

import java.util.Scanner;

public class HCF07 {
    public static void main(String[] args) {
        /*
        Highest Common Factor
        n1 = 12 - factors of 12 - 1,2,3,4,6,12
        n2 = 18 - factors of 18 - 1,2,3,6,9,18
        common factors = 1,2,3,6
        largest = 6
        HCF = 6
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter the Num2 : ");
        int num2 = in.nextInt();

        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF is : " + num1);
    }
}
