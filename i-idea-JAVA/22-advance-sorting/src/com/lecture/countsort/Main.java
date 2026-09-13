package com.lecture.countsort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] countArr = new int[max + 1];
        for (int num : arr) {
            countArr[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArr[i] > 0) {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }

    public static void countSortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int min = arr[0], max = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = map.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
