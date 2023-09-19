import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
public class leetCode238 {
    public static void main(String[] args) {
        int[] input = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(input)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod*=nums[i];
        }
        output[0] = prod;

        for (int i = 1; i < n; i++) {
            if(nums[i] == 0){
                prod =1;
                for (int k = 0; k < i; k++) {
                    prod*=nums[k];
                }
                for (int k = i+1; k < n; k++) {
                    prod*=nums[k];

                }
                output[i] = prod;
            }
            else{
                prod = (prod/nums[i]) * nums[i-1];
                output[i] = prod;
            }

        }
        return output;
    }

}

