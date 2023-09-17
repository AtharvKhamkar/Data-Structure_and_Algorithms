//https://leetcode.com/problems/plus-one/description/
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.

import java.util.*;
public class leetCode66 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int sum(int[] arr){
        int n = arr.length;
        int sum = 0;
        int j = 0;
        int final_sum = 0;
        for (int i = n-1; i >=0; i--) {
            sum += (int) (arr[i] * Math.pow(10, j));
            j++;
        }
        final_sum = sum + 1;
        return final_sum;
    }


    public static int[] plusOne(int[] digits) {
        int final_sum = sum(digits);
        int[] output = new int[Integer.toString(final_sum).length()];
        int length = output.length;
        List<Integer> newOutputList = new ArrayList<Integer>();
        for (int i = length-1; i >= 0; i--) {
            int remainder = final_sum % 10;
            newOutputList.add(remainder);
            final_sum = final_sum/10;

        }
        Collections.reverse(newOutputList);

        return output;


    }
}
