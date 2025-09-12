package com.practice;

public class RotationCount11 {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {2,2,4,5,5,6,7,0,1,2};

        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr){
//        int pivot = findPivot(arr);
        int pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }

    // use this for non duplicates
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (end > mid && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            if (arr[start] >= arr[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // use this when arr contains duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
