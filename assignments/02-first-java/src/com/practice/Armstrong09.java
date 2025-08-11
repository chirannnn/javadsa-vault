// To find Armstrong Number between two given number.



// bending
package com.practice;

import java.util.Scanner;

public class Armstrong09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int orin1 = n1;
        int orin2 = n2;

        int sum1 = 0;
        int sum2 = 0;

        while (n1 > 0 || n2 > 0){

            int rem1 = n1 % 10;
            n1 = n1 / 10;
            sum1 += rem1*rem1*rem1;

            int rem2 = n2 % 10;
            n2 = n2 / 10;
            sum2 += rem2*rem2*rem2;

        }
        if (sum1 == orin1){
            System.out.println(n1 + " is a Armstrong number");
        }else {
            System.out.println(n1 + " is not a armstrong number");
        }

        if (sum2 == orin2){
            System.out.println(n2 + " is a Armstrong number");
        }else {
            System.out.println(n2 + " is not a armstrong number");
        }
    }
}
