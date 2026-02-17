package com.lecture.easy;

public class CountZeros_08 {
    public static void main(String[] args) {
        System.out.println(count(402300540));
    }

    static int count(int n) {
        return countZeros(n, 0);
    }

    // special pattern, how to pass a value to above calls
    static int countZeros(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return countZeros(n / 10, c + 1);
        }
        return countZeros(n / 10, c);
    }
}
