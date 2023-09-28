//https://leetcode.com/problems/squares-of-a-sorted-array/description/
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.Arrays;

public class leetCode977 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }


    public static int[] sortedSquares(int[] nums) {

        //function to square array
        int[] sqArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sqArray[i] = nums[i]*nums[i];
            }
        }



        //functions to sort array in ascending order
        boolean swapped;
        for (int i = 0; i < sqArray.length; i++) {
            swapped = false;
            for (int j = 1; j < sqArray.length-i; j++) {
                if(sqArray[j] < sqArray[j-1]){
                    int temp = sqArray[j];
                    sqArray[j] = sqArray[j-1];
                    sqArray[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
        return sqArray;

    }


}
