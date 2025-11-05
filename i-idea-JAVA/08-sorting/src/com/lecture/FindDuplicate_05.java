package com.lecture;
// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate_05 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
