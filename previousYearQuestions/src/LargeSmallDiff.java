import java.util.*;
import java.lang.*;
public class LargeSmallDiff {
    public static void main(String[] args){
        int[] arr = {1 , 8 , 0 , 2 , 3 , 5 , 6};
        int n = arr.length;
        System.out.println(largeSmallSum(arr,n));

    }

    public static int largeSmallSum (int[]arr, int n){
        n = arr.length;
        int large = 0;
        int small = 0;
        ArrayList<Integer> secSmall = new ArrayList<>();
        ArrayList<Integer> secLarge = new ArrayList<>();

        for(int i=1;i<n;i=i+2){
            secSmall.add(arr[i]);
        }
        Collections.sort(secSmall);
        small  = secSmall.get(1);

        for(int i=0;i<n;i=i+2){
            secLarge.add(arr[i]);
        }
        Collections.sort(secLarge);
        large  = secLarge.get(secLarge.size()-2);

        return small + large;
    }
}
