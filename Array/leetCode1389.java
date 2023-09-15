import java.util.*;

//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
//Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//
//It is guaranteed that the insertion operations will be valid.
public class leetCode1389 {
    public static void main(String[] args) {
        int[] index = {0,1,2,2,1};
        int[] nums = {0,1,2,3,4};
        System.out.println(Arrays.toString(createTargetArray(nums,
                index)));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);

        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);

        }
        return target;
    }
}
