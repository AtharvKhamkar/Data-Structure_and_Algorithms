//https://leetcode.com/problems/rotate-array/description/
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//

import java.util.Arrays;

public class leetCode189_1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
       rotate(nums,k);

    }

    //For left shift
    public static int[] left_shift(int[] nums,int k){
        int n = nums.length-1;
        int[] output = new int[nums.length];
        int limit = k;
        int i =0;
        int desc = k;
        while(i< limit){
            output[i] = nums[n-desc];
            desc--;
            i++;
        }
        return output;
    }

    //for right shift
    public static int[] right_shift(int[] nums,int k){
        int[] newOutput = left_shift(nums,k);
        int n = nums.length;
        int start = 0;
        for (int i = k; i < n; i++) {
            newOutput[i] = nums[start];
            start++;

        }
        return newOutput;
    }

    public static void rotate(int[] nums, int k) {
        right_shift(nums,k);
        System.out.println(Arrays.toString(right_shift(nums,k)));
    }
}
