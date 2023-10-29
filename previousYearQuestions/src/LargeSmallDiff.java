import java.util.*;
import java.lang.*;
public class LargeSmallDiff {
    public static void main(String[] args){
        int[] arr = {3,2,1,7,5,4};
        int n = arr.length;
        System.out.println(largeSmallSum(arr,n));

    }

    public static int largeSmallSum (int[]arr, int n){
        n = arr.length;
        if(n < 3){
            return 0;
        }
        ArrayList<Integer> Largest = new ArrayList<>();
        ArrayList<Integer> smallest = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                Largest.add(arr[i]);
            }else{
                smallest.add(arr[i]);
            }
        }

        Collections.sort(Largest);
        Collections.sort(smallest);

        return Largest.get(Largest.size()-2) + smallest.get(1);
    }
}
