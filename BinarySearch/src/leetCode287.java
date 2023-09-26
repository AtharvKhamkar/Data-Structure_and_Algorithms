import java.util.Arrays;

public class leetCode287 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));


    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int leftMost = leftMost(nums,nums[i]);
            int rightMost = rightMost(nums,nums[i+1]);
            if(leftMost == rightMost){
                return leftMost;
            }

        }
        return -1;

    }


    public static int leftMost(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int leftMost = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                leftMost = nums[mid];
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return leftMost;
    }

    public static int rightMost(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int rightMost = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                rightMost = nums[mid];
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return rightMost;
    }


}
