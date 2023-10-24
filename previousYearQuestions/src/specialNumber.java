import java.util.*;

public class specialNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("Enter the value of N");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int result = DesiredArray(arr,N,k);
        System.out.println(result);


    }

    public static int DesiredArray(int[] Arr, int N, int k){
        int count = 0;
        int l = 1;
        int sum = 0;
        while(count < k){
            if(isDivisible(Arr,l)){
                sum += l;
                count++;
            }
            l++;

        }
        return sum;

    }

    public static boolean isDivisible(int[] arr,int number){
        for(int j=0;j<arr.length;j++){
            if(number % arr[j] == 0){
                return false;
            }
        }
        return true;
    }
}
