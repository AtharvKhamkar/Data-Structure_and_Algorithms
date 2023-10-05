//https://leetcode.com/problems/set-mismatch/description/
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.

import java.util.Arrays;

public class leetCode645 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] target = new int[2];

        int i = 0;
        while(i < nums.length){
            int selected = nums[i] - 1;
            if(nums[i] != nums[selected]){
                swap(nums,i,selected);
            }else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                target[0] = nums[index];
            }
            if(nums[index] != index+1){
                target[1] = index+1;
            }

        }
        return target;
    }

    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
