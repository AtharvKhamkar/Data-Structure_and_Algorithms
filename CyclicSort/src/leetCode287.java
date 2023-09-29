//https://leetcode.com/problems/find-the-duplicate-number/description/
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.
import java.util.*;
public class leetCode287 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(findDuplicate(nums));


    }

    public static int findDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int selected = nums[i]-1;
            if(nums[i] != nums[selected]){
                swap(nums,i,selected);
            }else{
                i++;
            }
        }


        int misMatch = 0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                misMatch = nums[index];

            }

        }
        return misMatch;

    }

    public static void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
