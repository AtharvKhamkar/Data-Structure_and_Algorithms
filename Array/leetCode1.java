import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
public class leetCode1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }


    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target){
                    index[0] = i;
                    index[1] = j;
                    break;

                }

            }

        }
        return index;

    }
}
