// Perfect Number In Java

package com.practice;

import java.util.Scanner;

public class PerfectNumber10 {
    public static void main(String[] args) {
        /*
        num = 6;
        divisors - 1,2,3 = 1 + 2 + 3 = 6
        so 6 is a perfect number
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= n / 2; i++){
            if (n % i == 0){
                sum += i;
            }
        }

        if (sum == n){
            System.out.println(n + " is perfect number");
        }else {
            System.out.println(n + " is not a perfect Number");
        }
    }
}
