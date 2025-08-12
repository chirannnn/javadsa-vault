// Take inputs till 0 and print largest number

package com.practice;

import java.util.Scanner;

public class LargestUntilZero10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int num;

        System.out.print("ENter a num to find largest (enter 0 to stop) : " );
        while (true){
            num = in.nextInt();
            if (num == 0){
                break;
            }
            if (num > largest){
                largest = num;
            }
        }
        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number entered: " + largest);
        }
    }
}
