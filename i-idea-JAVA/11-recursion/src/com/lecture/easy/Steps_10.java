package com.lecture.easy;

public class Steps_10 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int steps) {
        if (n == 0) {
            return steps;
        }

        if (n % 2 == 0) {
            return helper(n / 2, steps + 1);
        }
        return helper(n - 1, steps + 1);
    }
}
