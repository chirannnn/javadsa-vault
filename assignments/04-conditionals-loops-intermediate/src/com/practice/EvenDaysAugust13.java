//Kalai is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

package com.practice;

public class EvenDaysAugust13 {
    public static void main(String[] args) {
        int aug = 31;
        int count = 0;

//        int count = aug / 2;
        for (int i = 1; i <= aug; i++){
            if(i % 2 == 0){
                count++;
            }
        }

        System.out.println("Kalai can go out on " + count + " days in August");
    }
}
