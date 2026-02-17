package com.lecture.easy;

public class Palindrome_07 {
    public static void main(String[] args) {
        System.out.println(isPal(12321));
    }

    static boolean isPal(int n) {
        return n == rev(n);
    }

    static int rev(int n) {
        int digitCount = (int) (Math.log10(n) + 1);
        return helper(n, digitCount);
    }

    static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }
}
