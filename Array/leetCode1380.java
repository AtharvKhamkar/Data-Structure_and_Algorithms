import java.util.*;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

public class leetCode1380 {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(arr));

    }

    public static  List<Integer> luckyNumbers (int[][] matrix){
        int small,big;
        List<Integer> list = new ArrayList<Integer>();

        int n = matrix.length;
        int m = matrix[0].length;
        int i=0;
        int j = 0;

        for ( i = 0; i < n ; i++) {
            int k = 0;
            small = Integer.MAX_VALUE;
            for (j = 0; j < m; j++) {
                if(matrix[i][j] < small){
                    small = matrix[i][j];
                    k=j;
                }
            }
            big = small;

            for (j = 0; j < matrix.length; j++) {
                big = Math.max(big, matrix[j][k]);
            }
            if(small == big){
                list.add(small);
            }




        }
        return list;
    }


}
