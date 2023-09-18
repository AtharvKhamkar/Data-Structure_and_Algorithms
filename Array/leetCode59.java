//https://leetcode.com/problems/spiral-matrix-ii/description/
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

import java.util.Arrays;

public class leetCode59 {
    public static void main(String[] args) {
        int n = 3;
        int[][] output= {{1,2,3},{8,9,4},{7,6,5}};
        System.out.println(Arrays.deepToString(generateMatrix(n)));

    }

    public static int[][] generateMatrix(int n) {
        int[][] output = new int[n][n];
        int[] num = new int[n*n];
        for (int i = 0; i < n*n; i++) {
            num[i] = i+1;
        }


        int uRow = n - 1;
        int lRow = 0;
        int uCol = n - 1;
        int lCol = 0;
        int counter = 0;

        while(counter < n*n){

            //for upper bond
            for (int col = lCol; col <= uCol && counter < n*n; col++) {
                output[lRow][col] = num[counter];
                counter++;

            }
            lRow++;

            //for right bond
            for (int row = lRow; row <= uRow && counter < n*n; row++) {
                output[row][uCol] = num[counter];
                counter++;

            }
            uCol--;

            //for bottom bound
            for (int col = uCol; col >= lCol && counter < n*n; col--) {
                output[uRow][col] = num[counter];
                counter++;

            }
            uRow--;

            //for left bound
            for (int row = uRow; row >= lRow && counter < n*n ; row--) {
                output[row][lCol] = num[counter];
                counter++;

            }
            lCol++;
        }
        return  output;


    }
}
