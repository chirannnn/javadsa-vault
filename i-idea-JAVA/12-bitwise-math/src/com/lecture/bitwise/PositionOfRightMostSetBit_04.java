package com.lecture.bitwise;

public class PositionOfRightMostSetBit_04 {
    public static void main(String[] args) {
        int n = 18;

        System.out.println(rightMost(n));
    }

    static int rightMost(int n) {
        if (n == 0) return 0;

        return n & (-n);
    }
}
