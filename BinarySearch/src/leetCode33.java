//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.

public class leetCode33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));


    }

    public static int search(int[] nums,int target){
        int peak = peakIndexInMountainArray(nums,target);
        int firstry = binarySearch(nums,target,0,peak);
        int secondtry = binarySearch(nums,target,peak+1,nums.length-1);
        if(firstry != -1){
            return firstry;
        }else{
            return secondtry;
        }
    }

    public static int peakIndexInMountainArray(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int binarySearch(int[] arr, int target,int start,int end) {


        while (start <= end) {

            //find the middle element
            int mid = start + (end - start) / 2;   //similar to mid = (start + end)/2

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // element not found
        return -1;
    }
}
