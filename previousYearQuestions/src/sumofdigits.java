import java.util.*;
import java.lang.*;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(differenceSumOfDigits(arr,arr.length));

    }
    public static int differenceSumOfDigits(int[] arr, int n){
        int numbersSum = 0;
        for(int i:arr){
            numbersSum += i;
        }

        int f2 = numbersSum % 10;
        int f1 = digitSum(arr);

        return f1 - f2;
    }

    public static int digitSum(int[] arr){
        int digitSum = 0;
        for(int j=0;j<arr.length;j++){
            int number = arr[j];
            int digit = 0;
            while(number > 0){
                digit = number % 10;
                digitSum += digit;
                number = number / 10;
            }
        }

        return digitSum % 10;
    }
}
