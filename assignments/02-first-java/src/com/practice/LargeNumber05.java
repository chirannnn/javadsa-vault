// Take 2 numbers as input and print the largest number.

package com.practice;

import java.util.Scanner;

public class LargeNumber05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if(n1 > n2){
            System.out.println("Large Num is : " + n1);
        }else  if(n2 > n1){
            System.out.println("Large Num is : " + n2);
        }else {
            System.out.println("Both Nums are equal ");
        }
    }
}
