package com.lecture.bitwise;

public class FindUniqueII_05 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};

        System.out.println(findunique(nums));
    }

//        https://leetcode.com/problems/single-number-ii/description/

    static int findunique(int[] nums) {


        int[] arr = new int[32];

        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                arr[i] += (num >> i) & 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (arr[i] % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
