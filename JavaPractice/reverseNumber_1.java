import java.util.Arrays;

public class reverseNumber_1 {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        reverse(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;

        for(int i=0;i<nums.length;i++){
            while(start < end){
                swap(nums,start,end);
                start++;
                end--;
            }
        }

    }

    public static void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
