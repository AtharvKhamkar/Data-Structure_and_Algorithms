//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
import java.util.*;
public class leetCode442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));


    }

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> target = new ArrayList<>();

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
                target.add(nums[index]);
            }
        }

        return target;

    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
