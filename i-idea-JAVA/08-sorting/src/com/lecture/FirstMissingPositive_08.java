package com.lecture;
// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive_08 {
    public static void main(String[] args) {
        int[] nums = {1,2,0};

        System.out.println(missingPositive(nums));
    }

    static int missingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return index+1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
