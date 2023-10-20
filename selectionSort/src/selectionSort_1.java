import java.util.Arrays;

public class selectionSort_1 {
    public static void main(String[] args) {
        int[] nums = {6,4,3,2,19,27};
        selection(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void selection(int[] nums){
        int maxIndex = 0;
        for (int k = 0; k < nums.length; k++) {
            int last = nums.length - k -1;
            maxIndex = getMaxIndex(nums,0,last);
            swap(nums,maxIndex,last);

        }
    }

    public static int getMaxIndex(int[] nums,int start,int end){
        int MAX = start;
        for(int i=start;i<=end;i++){
            if(nums[i] > nums[MAX]){
                MAX = i;
            }
        }
        return MAX;

    }

    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
