//https://leetcode.com/problems/intersection-of-two-arrays/description/
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
import java.util.*;
public class leetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int result = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        if (nums1.length > nums2.length){
            int[] ans1 = new int[nums1.length];
            int j = 0;
            for (int i = 0; i < nums2.length-1; i++) {
                result = binarySearch(nums1,nums2[i]);
                if(result!=-1){
                    ans.add(nums2[i]);
                }
            }

        }else if(nums1.length == nums2.length){
            result = binarySearch(nums1,nums2[0]);
            if(result!=-1){
                ans.add(nums2[0]);
            }
        }
        else {
            int[] ans2 = new int[nums2.length];
            int k = 0;
            for (int i = 0; i < nums1.length - 1; i++) {
                result = binarySearch(nums2, nums1[i]);
                if (result != -1) {
                    ans.add(nums1[i]);
                }

            }
        }
        int[] finalAns =  new int[ans.size()];
        for (int i = 0; i < finalAns.length; i++) {
            finalAns[i] = ans.get(i);
         }
        return finalAns;
    }

    public static int binarySearch(int[] nums,int target){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                mid = end - 1;
            }
            return nums[mid];
        }
        return -1;
    }

}
