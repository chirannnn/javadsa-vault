// To find Armstrong Number between two given number.

package com.practice;

import java.util.Scanner;

public class Armstrong09 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.print("Enter two Numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if(n1 > n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        boolean found = false;

        for (int i = n1; i <= n2; i++){
            if(isArmstrong(i)){
                System.out.println(i + " is an Armstrong num between given nums");
                found = true;
            }
        }

        if(!found){
            System.out.println("No Armstrong nums in given numbers range");
        }

    }

    static  boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            sum += Math.pow(rem, digits);
        }
        return originalNum == sum;
    }
}
