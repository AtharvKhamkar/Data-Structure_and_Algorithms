import java.util.ArrayList;

public class leetCode1539_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));

    }

    public static int findKthPositive(int[] arr, int k) {
        int MaxElement = findMax(arr);
        ArrayList<Integer> result = new ArrayList<>();
        int bsResult = 0;
        int finalAns = 0;

        for(int i=0;i<MaxElement;i++){
            bsResult = binarySearch(arr,i,0,arr.length-1);

            if(bsResult == -1){
                result.add(i);
            }
        }

        finalAns = result.get(k);
        return finalAns;

    }

    public static int binarySearch(int[] nums,int target,int start,int end){

        while(start <= end){
            int mid = start + (end + start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int findMax(int[] nums){
        int MAX = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>MAX){
                MAX=nums[i];
            }
        }
        return MAX;
    }
}
