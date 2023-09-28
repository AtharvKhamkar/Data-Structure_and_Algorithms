//https://leetcode.com/problems/height-checker/description/
//A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
//
//You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
//
//Return the number of indices where heights[i] != expected[i].

import java.util.Arrays;

public class leetCode1051 {
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5};
        System.out.println(heightChecker(height));

    }

    public static int heightChecker(int[] heights) {
        int[] oldHeight = new int[heights.length];
        int totalCount;
        for(int i = 0; i < heights.length; i++) {
            oldHeight[i] = heights[i];
        }
        Arrays.sort(heights);
        totalCount = check(oldHeight,heights);
        return totalCount;

    }

    public static int check(int[] nums1,int[] nums2){
        int count = 0;
        for (int i = 0; i < nums1.length;) {
            for (int j = 0; j < nums2.length;) {
                if(nums1[i] != nums2[j]){
                    count++;
                }
                i++;
                j++;

            }
        }
        return count;
    }




}
