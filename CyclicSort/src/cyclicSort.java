import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        cycSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void cycSort(int[] nums){
        int i = 0;
        while(i< nums.length){
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
