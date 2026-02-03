package com.lecture.maths;

public class Prime_01 {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }

            c++;
        }
        return true;
    }
}
