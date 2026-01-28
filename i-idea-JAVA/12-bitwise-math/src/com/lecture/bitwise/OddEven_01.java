package com.lecture.bitwise;

public class OddEven_01 {
    public static void main(String[] args) {
        int n = 61;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
