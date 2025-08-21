package com.practice;

public class Max {
    public static void main(String[] args) {
        int[] arr = {23, 50, 7, 8, 10};

        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end){

        if(start > end){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int max = arr[start];
        for (int i = start; i <= end; i++) {
             if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr){

        if (arr.length == 0){
            return -1;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
