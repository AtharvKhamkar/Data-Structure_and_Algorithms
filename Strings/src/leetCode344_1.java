import java.util.*;
public class leetCode344_1 {
    public static void main(String[] args){
        char[] arr = {'h','e','l','l','o'};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArray(char[] c){
        int s = 0;
        int e = c.length-1;

        while(s < e){
            swap(c,s,e);
            s++;
            e--;
        }
    }

    public static void swap(char[] arr,int index1,int index2){
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
