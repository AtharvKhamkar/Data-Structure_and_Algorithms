//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
//There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
//
//Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
//
//Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
//
//You must decrease the overall operation steps as much as possible.

public class leetCode81 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(search(nums,target));


    }

    public static boolean search(int[] nums, int target) {
        int finalAns = elementFound(nums,target);
        if(finalAns != -1){
            return true;
        }else{
            return false;
        }
    }

    public static int elementFound(int[] nums,int target){
        int pivot = pivotElement(nums);
        int firstTry = binarySearch(nums,target,0,pivot);
        int secondTry = binarySearch(nums,target,pivot+1,nums.length-1);

        if(firstTry != -1){
            return firstTry;
        }else{
            return secondTry;
        }
    }
    
    public static int pivotElement(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            } else if (mid == end && start == end) {
                return mid;


            } else if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end] < nums[end-1]){
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    
    public static int  binarySearch(int[] nums,int target,int start,int end ){
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
