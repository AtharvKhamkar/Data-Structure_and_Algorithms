//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.*;
public class leetCode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> target = new ArrayList<>();
        cyclicSort(nums);
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                target.add(nums[index]);
            }
        }
        return target;

    }

    public static void cyclicSort(int[] nums){
        int i =0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
    }

    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
