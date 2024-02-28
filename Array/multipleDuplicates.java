import java.util.*;
public class multipleDuplicates {
    public static void main(String[] args){
        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11 };
        findDupicates(arr);


    }

    public static void findDupicates(int[] nums){
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();

        boolean isPresent = false;
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    if(result.contains(nums[i])){
                        break;
                    }else{
                        result.add(nums[i]);
                        isPresent = true;
                    }
                }
            }
        }


        if(isPresent){
            System.out.println(result + " ");
        }else{
            System.out.println("There is no duplicate element");
        }
    }
}
