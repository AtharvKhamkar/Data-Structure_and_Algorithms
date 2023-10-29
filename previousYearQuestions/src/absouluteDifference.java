import java.util.*;
import java.lang.*;
public class absouluteDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the difference");
        int diff = sc.nextInt();
        System.out.println(findCount(arr,length,num,diff));

    }
    public static int findCount (int[] arr, int length, int num, int diff){
        length = arr.length;
        int count = 0;
        for(int i=0;i<length;i++){
            if(Math.abs(arr[i] - num) <= diff){
                count++;
            }
        }
        return count;
    }
}
