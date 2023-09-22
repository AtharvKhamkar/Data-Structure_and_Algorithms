//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

public class leetCode1351 {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(grid));

    }

    public static int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }

            }
        }
        return count;
    }

}
