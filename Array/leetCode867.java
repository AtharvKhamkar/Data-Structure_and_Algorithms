//https://leetcode.com/problems/transpose-matrix/description/
//Given a 2D integer array matrix, return the transpose of matrix.
//
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

import java.util.Arrays;

public class leetCode867 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));

    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;

        int[][] transpose = new int[m][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                transpose[col][row] = matrix[row][col];

            }

        }

        return transpose;

    }
}
