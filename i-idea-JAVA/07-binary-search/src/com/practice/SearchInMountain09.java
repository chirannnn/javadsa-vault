package com.practice;
// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain09 {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;

        int index = findInMountainArray(mountainArr, target);
        System.out.println(index);
    }

    static int findInMountainArray(int[] arr, int target){
        int n = arr.length - 1;
        int peak = findPeak(arr);
        int ans = search(arr,target, 0, peak, true);
        if(ans != -1){
            return ans;
        }
        ans = search(arr, target, peak + 1, n, false);
        return ans;
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start; // it's a peak element
    }

    static int search(int[] arr, int target, int start, int end, boolean isAsc){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
