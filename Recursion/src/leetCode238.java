import java.util.Arrays;

public class leetCode238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] target = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];


        int product = 1;

        for(int i=0;i<nums.length;i++){
            product = product * nums[i];
            prefix[i] = product;
        }
        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            product = product * nums[i];
            postfix[i] = product;
        }

        for(int j=0;j<target.length;j++){
            if(j == 0){
                target[0] = postfix[1];
            } else if (j == nums.length-1) {
                target[nums.length-1] = prefix[nums.length-2];
            }else{
                target[j] = prefix[j-1] * postfix[j+1];
            }
        }

        return target;
    }
}
