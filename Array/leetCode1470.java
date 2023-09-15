//https://leetcode.com/problems/shuffle-the-array/
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

import java.util.Arrays;

public class leetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int size = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums,size)));

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[j] = nums[i];
            j = j + 2;

        }
        int k = 1;
        for(int i = n; i<2*n; i++){
            arr[k] = nums[i];
            k = k + 2;
        }
        return arr;
    }
}
