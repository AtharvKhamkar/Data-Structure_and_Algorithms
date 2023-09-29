//https://leetcode.com/problems/missing-number/description/
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array

public class leetCode268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct =nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        //search for missing values
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
