import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
public class leetCode1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    public static int[] getConcatenation(int[] nums) {
        int ans;
        int numsLength = nums.length;
        int[] result = new int[2*numsLength];
        for(int index=0; index<numsLength; index++){
            ans = nums[index];
            result[index] = ans;
            result[index+numsLength] = ans;
        }
        return result;
    }
}
