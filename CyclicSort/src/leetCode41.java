//https://leetcode.com/problems/first-missing-positive/description/
//Given an unsorted integer array nums, return the smallest missing positive integer.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

public class leetCode41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));

    }

    public static int firstMissingPositive(int[] nums) {
        int missedNumber = 0;
        int i = 0;
        int small = smallestNums(nums);

        while(i<nums.length){
            int selected = nums[i] - small-1;
            if(nums[i] != nums[selected]){
                swap(nums,i,selected);
            }else{
                i++;
            }
        }

        for (int index = 0; index < nums.length;index++) {
            if(nums[index] < 0){
                index++;
            } else if (index != nums[index] - small) {
                    missedNumber = index + nums[i] + small;
                }

            }
        return missedNumber;
    }



    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int smallestNums(int[] nums){
        int smallest = nums[0];
        int i = 0;
        while(i < nums.length){
            if(smallest > nums[i]){
                smallest = nums[i];

            }
            i++;
        }
        return smallest;
    }
}
