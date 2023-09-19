import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class leetCode189 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(input,k);

    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        int last = nums.length -1;
        int[] output = new int[nums.length];

        for (int i = 0; i < k; i++) {
            int temp = nums[last];
            output[0] = temp;
            for (int j = 1; j < n;) {
                for (int l = 0; l < n; l++) {
                    output[j] = nums[l];
                    j++;
                }
            }
            temp=0;
            last--;
        }
        System.out.println(Arrays.toString(output));

    }
}
