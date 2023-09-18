//https://leetcode.com/problems/set-matrix-zeroes/description/
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.
import java.util.*;
class leetCode73{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);


    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dummyRow = new int[row];
        int[] dummyCol = new int[col];
        Arrays.fill(dummyRow, -1);
        Arrays.fill(dummyCol, -1);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    dummyRow[i] = 0;
                    dummyCol[j] = 0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dummyRow[i] == 0 || dummyCol[j] == 0 ){
                    matrix[i][j]=0;
                }
            }
        }

    }

}



