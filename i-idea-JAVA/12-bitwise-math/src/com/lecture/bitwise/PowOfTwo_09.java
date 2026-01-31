package com.lecture.bitwise;

public class PowOfTwo_09 {
    public static void main(String[] args) {
        int n = 0;

        System.out.println(powOf2(n));
    }

    static boolean powOf2(int n) {
        if (n <= 0) return false;

        boolean ans = (n & (n - 1)) == 0;

        return ans;
    }
}
