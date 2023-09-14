import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
public class leetCode1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));


    }

    public static int[] runningSum(int[] nums) {
        int ans = 0;
        int[] result = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            ans = ans + nums[index];
            result[index] = ans;

        }
        return result;
    }
}
