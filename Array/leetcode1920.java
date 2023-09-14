//https://leetcode.com/problems/build-array-from-permutation/
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

import java.util.Arrays;

public class leetcode1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));

    }

    public static int[] buildArray(int[] nums) {
        int ans=0;
        int[] result = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {
            ans = nums[nums[index]];
            result[index] = ans;
        }
        return result;

    }

}
