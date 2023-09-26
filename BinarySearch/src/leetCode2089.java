//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
//You are given a 0-indexed integer array nums and a target element target.
//
//A target index is an index i such that nums[i] == target.
//
//Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.


import java.util.*;
public class leetCode2089 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 5;
        System.out.println(targetIndices(nums,target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> targetArray = new ArrayList<>();
        int left = leftMost(nums,target);
        int right = rightMost(nums,target);

        if(left == -1){
            return targetArray;
        }

        for (int i = left; i <= right ; i++) {
            targetArray.add(i);

        }
        return targetArray;

    }

    //for searching another possible outcomes in the left side of the mid
    public static int leftMost(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int leftMost = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                leftMost = mid;
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid + 1;

            }else{
                end = mid -1;
            }
        }

        return leftMost;
    }
//for searching another possible outcomes in the right side of the mid
    public static int rightMost(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int rightMost = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                rightMost = mid;
                start = mid + 1;
            } else if (nums[mid]<target ) {
                start = mid+1;

            }else{
                end = mid -1;
            }

        }
        return rightMost;
    }



}



