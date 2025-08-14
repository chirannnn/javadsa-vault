/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
 */

import java.util.Scanner;

public class Factorial08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        factorial(n);
    }

    static void factorial(int num){
        int fac = 1;
        if(num == 0){
            fac = 1;
        }else {
            for (int i = 1; i <= num; i++){
                fac *= i;
            }
        }
        System.out.println("Factorial of " + num + " is " + fac);
    }

//    static long factorial(int num) {
//        long fac = 1; // start with 1
//        for (int i = 1; i <= num; i++) {
//            fac *= i;
//        }
//        return fac;
//    }
}
