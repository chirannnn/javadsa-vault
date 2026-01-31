package com.lecture.bitwise;

public class PascalsTriangle_08 {
    public static void main(String[] args) {
        // sum of nth row

        int numRows = 3;

        int ans = 1 << (numRows - 1);
        System.out.println(ans);
    }
}
