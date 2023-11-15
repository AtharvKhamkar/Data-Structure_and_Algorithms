import java.util.*;
import java.lang.*;
public class maxElementIndex {
    public static void main(String[] args){
        int[] arr = {23 ,45, 82, 27, 66, 12, 78, 13, 71, 86};
        int n = arr.length;
        maxInArray(arr,n);

    }

    public static void maxInArray (int[] arr, int length){
        int MAX = arr[0];
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > MAX){
                MAX = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(MAX);
        System.out.println(maxIndex);
    }

}
