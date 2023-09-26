//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
//
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//Your solution must use only constant extra space.

import java.util.Arrays;

public class leetCode167 {
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] targetIndex = new int[2];
        int range = binarySearch(numbers,target);
        for (int i = 0; i <= range ; i++) {
            for (int j = i+1; j <= range; j++) {
                if(numbers[i] + numbers[j] == target){
                    targetIndex[0] = i+1;
                    targetIndex[1] = j+1;

                }

            }
        }
        return targetIndex;

    }



    public static int binarySearch(int[] numbers,int target){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(numbers[mid] < target){
                start = mid+1;
            } else if (numbers[mid] > target) {
                end = mid - 1;

            }
            else{
                return end;
            }
        }
        return end;
    }
}
