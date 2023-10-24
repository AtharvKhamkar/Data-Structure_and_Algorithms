import java.util.*;
import java.lang.*;
public class sumPrimeIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sumPrimeIndices(arr,n));

    }

    public static int sumPrimeIndices(int[] arr,int n){
        int sum = 0;
        for (int j = 2; j < arr.length; j++) {
            if(isPrime(arr,j)){
                sum += arr[j];
            }

        }
        return sum;
    }

    public static boolean isPrime(int[]arr,int number){
        int n = arr.length;
        int reminder = 0;
        for(int i=2;i<arr.length;i++){
            if(number == i){
                continue;
            }
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
