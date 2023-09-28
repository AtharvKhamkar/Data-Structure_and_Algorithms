//https://leetcode.com/problems/missing-number/description/
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

import java.util.*;
public class leetCode268 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));

    }


    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;

        int end = nums.length;

        int finalAns = 0;

        for (int i = 0; i <= nums.length; i++) {
              finalAns = binarySearch(nums,i,start,end);
        }
        return finalAns;
    }

    public static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){

            int mid = start + (end-start) / 2;

            if(nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }else{
                return nums[mid];
            }
        }
        return end;
    }
}
