//https://leetcode.com/problems/reshape-the-matrix/description/
//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//
//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
//
//
import java.util.*;
public class leetCode566 {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));


    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length;
        int col = mat[0].length;

        if((row * col) != (r * c)) return mat;

        int[][] output = new int[r][c];
        int output_row = 0;
        int output_col = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                output[output_row][output_col] = mat[i][j];
                output_col++;

                if(output_col == c){
                    output_col=0;
                    output_row++;
                }

            }

        }
        return output;


    }




}
