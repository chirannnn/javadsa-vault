package com.lecture.radixsort;

import java.util.Arrays;

public class Main {

    public static void radixSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;

        int[] output = new int[n];
        int[] count = new int[10];

        // 1. Count how many times each digit occurs
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        System.out.println("Count: " + Arrays.toString(count));

        // 2. Convert count[] into positions
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        System.out.println("Positions: " + Arrays.toString(count));

        // 3. Put elements into output[]
        // Go from RIGHT to LEFT to keep the sort stable
        for (int i = n - 1; i >= 0; i--) {

            int digit = (arr[i] / exp) % 10;

            int position = count[digit] - 1;

            output[position] = arr[i];

            count[digit]--;
        }

        System.out.println("Output: " + Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {29, 83, 471, 36, 91, 8};

        System.out.println("Origin array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
