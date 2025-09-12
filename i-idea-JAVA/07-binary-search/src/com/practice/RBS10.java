package com.practice;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RBS10 {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
//        int target = 3;
        int[] arr = {2,5,6,0,0,1,2};
        int target = 6;

        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1){
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (target == arr[pivot]){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            if (arr[start] >= arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // use this when arr contains duplicates
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(end > start && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // check whether end is pivot
                if(end > start && arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
