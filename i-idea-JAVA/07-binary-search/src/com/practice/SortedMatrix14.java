package com.practice;

import java.util.Arrays;

public class SortedMatrix14 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return new int[]{-1, -1};
        }

        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0) {
            return new int[]{-1, -1};
        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int colMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            }
            if (matrix[mid][colMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][colMid] == target) {
            return new int[]{rStart, colMid};
        }
        if (matrix[rEnd][colMid] == target) {
            return new int[]{rEnd, colMid};
        }

        // search in 1st half
        if (colMid - 1 >= 0 && target <= matrix[rStart][colMid - 1]) {
            return binarySearch(matrix, rStart, 0, colMid - 1, target);
        }
        // search in 2nd half
        if (colMid + 1 < cols && target >= matrix[rStart][colMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, colMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (colMid - 1 >= 0 && target <= matrix[rEnd][colMid - 1]) {
            return binarySearch(matrix, rEnd, 0, colMid - 1, target);
        }
//        else {
//            return binarySearch(matrix, rEnd, colMid + 1, cols - 1, target);
//        }

        // No need for 'else' since the previous if already returns
        return binarySearch(matrix, rEnd, colMid + 1, cols - 1, target);
    }
}
