package com.lecture.arrays;

public class Sorted_01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 9, 6};

        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] nums, int index) {
        // base condition
        if (index == nums.length - 1) {
            return true;
        }

        return nums[index] < nums[index + 1] && sorted(nums, index + 1);
    }
}
