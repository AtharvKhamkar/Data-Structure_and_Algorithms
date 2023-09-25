//https://leetcode.com/problems/search-a-2d-matrix/description/
//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.

import java.util.Arrays;

public class leetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3},

        };
        System.out.println(searchMatrix(matrix,3));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}
