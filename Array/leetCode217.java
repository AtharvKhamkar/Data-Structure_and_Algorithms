//https://leetcode.com/problems/contains-duplicate/description/
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.Arrays;

public class leetCode217 {
    public static void main(String[] args) {
        int[] nums = {2,14,18,22,22};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]){
                return true;
            }

        }
        return false;

    }


}
