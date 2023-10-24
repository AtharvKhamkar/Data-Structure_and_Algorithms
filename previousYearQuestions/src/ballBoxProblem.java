import java.util.*;
import java.lang.*;
public class ballBoxProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of present balls");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(NumberOfBalls(arr,n));


    }

    public static int NumberOfBalls(int[] arr, int n){
        int totalBalls = 0;
        for(int i=0;i<arr.length;i++){
            totalBalls += (int) Math.pow((i+1),2);
        }
        int presentBalls = 0;
        for(int j:arr){
            presentBalls += j;
        }

        return totalBalls - presentBalls;
    }
}
