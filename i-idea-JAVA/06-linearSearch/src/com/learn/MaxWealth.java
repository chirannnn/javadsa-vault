package com.learn;
// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {{1,2,4}, {1,2,3}};

        System.out.println(maximumWealth(acc));
    }

    static int maximumWealth(int[][] acc){
        int max = Integer.MIN_VALUE;

        for (int[] ints : acc) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
