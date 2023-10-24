import java.util.*;
public class maxInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in ar array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements  in an array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        MaxInArray(arr,len);

    }

    public static void MaxInArray(int arr[],int length){
        length = arr.length;
        int max = 0;
        int maxIndex = 0;
        for(int i=0;i<length;i++){
            if(max<arr[i]){
                maxIndex = i;
            }

        }



        System.out.println(max);
        System.out.println(maxIndex);


    }
}
