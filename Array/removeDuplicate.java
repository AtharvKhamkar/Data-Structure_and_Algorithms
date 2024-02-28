import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,5,6,7,8,9};
        int[] result = deleteDuplicates(nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] deleteDuplicates(int[] nums){
        int dupIndex = duplicateIndex(nums);
        int[] result = new int[nums.length-1];

        for(int i=0,k=0;i<nums.length;i++){
            if(i==dupIndex){
                continue;
            }

            result[k++] = nums[i];
        }
        return result;
    }

    public static int duplicateIndex(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return j;
                }
            }
        }
        return 0;
    }
}
