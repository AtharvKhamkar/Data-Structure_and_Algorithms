import java.util.*;
public class leetCode34_1 {
    public static void main(String[] args){
        int[] answer = {-1,-1};
        int[] nums = {5,7,7,7,7,8,8,10};
        answer[0] = positions(nums,7,true);
        answer[1] = positions(nums,7,false);
        System.out.println(Arrays.toString(answer));

    }

    public static int positions(int[] arr,int target,boolean findFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findFirst){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
