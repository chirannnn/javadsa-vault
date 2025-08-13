// Check Leap Year Or Not

package com.practice;

import java.util.Scanner;

public class LeapYear11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = in.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
