import java.util.*;
public class leetCode167_1 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0,h = numbers.length-1;
        while(numbers[l] + numbers[h] != target){
            if(numbers[l] + numbers[h] < target){
                l++;
            }else{
                h--;
            }

        }
        return new int[]{l+1,h+1};
    }
}
