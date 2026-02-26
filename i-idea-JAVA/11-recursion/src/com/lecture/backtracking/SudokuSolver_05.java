package com.lecture.backtracking;

public class SudokuSolver_05 {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;

        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
            // sudoku is solved
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));

        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;
        for (int r = startRow; r < startRow + sqrt; r++) {
            for (int c = startCol; c < startCol + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
