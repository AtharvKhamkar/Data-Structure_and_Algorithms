import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,18,23,16};
        System.out.println(Arrays.toString(arr));
        System.out.println("Array After the reversing");
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
