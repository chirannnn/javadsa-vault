package com.lecture.bitwise;

public class BitOperations_03 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(resetIthBit(num, 2));
    }

    static int findIthBit(int n, int i) {
        return n & (1 << (i - 1));
    }

    static int setTheIthBit(int n, int i) {
        return n | (1 << (i - 1));
    }

    static int resetIthBit(int n, int i) {
        return n & ~(1 << (i - 1));
    }
}
