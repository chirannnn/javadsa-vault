package com.lecture.easy;

public class Reverse_06 {

    static int sum = 0;
    static void rev(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
    }

    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digitCount = (int) (Math.log10(n) + 1);
        return helper(n, digitCount);
    }

    static int helper(int n, int digit) {

        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        return (rem * (int) (Math.pow(10, digit - 1))) + helper(n / 10, digit - 1);
    }

    static int rev3(int n, int r) {
        if (n == 0) {
            return r;
        }

        int rem = n % 10;
        return rev3(n / 10, r * 10 + rem);
    }

    public static void main(String[] args) {
        rev(56);
        System.out.println(sum);

        int ans = rev2(56);
        System.out.println(ans);

        // rev3 is preferred
        int res = rev3(56, 0);
        System.out.println(res);
    }


}
