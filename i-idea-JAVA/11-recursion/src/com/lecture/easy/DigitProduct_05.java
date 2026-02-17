package com.lecture.easy;

public class DigitProduct_05 {
    public static void main(String[] args) {
        int ans = digitProduct(1234);
        System.out.println(ans);
    }

    static int digitProduct (int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * digitProduct(n / 10);
    }
}
