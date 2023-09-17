//https://leetcode.com/problems/convert-1d-array-into-2d-array/description/
//You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
//
//The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
//
//Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.

import java.util.*;
public class leetCode2022 {
    public static void main(String[] args) {
        int[] original = {1,2};
        System.out.println(Arrays.deepToString(construct2DArray(original, 1, 1)));


    }


    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] newArray = new int[m][n];
        int[] empty = new int[0];
        int output_row = 0;
        int output_col = 0;
        int l = original.length;
        if((original.length) != (m*n)) return new int[][]{};

        for (int i = 0; i < l; i++) {
            newArray[output_row][output_col] = original[i];
            output_col++;
            if(output_col == n){
                output_col = 0;
                output_row++;
            }

        }
        return newArray;

    }
}
