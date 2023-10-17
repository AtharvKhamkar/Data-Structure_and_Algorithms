import java.util.Arrays;

public class leetCode189 {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        System.out.println(Arrays.toString(left_shift(nums,2)));

    }
    public static int[] left_shift(int[] nums,int k){
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int second = (i + k) % nums.length;
            target[second] = nums[i];
        }
        return target;
    }


}
