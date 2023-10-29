import java.util.*;
import java.lang.*;
public class productSmallestPair {
    public static void main(String[] args){
        int[] arr = {9 , 8 , 3 , -7 , 3 , 9};
        int n = arr.length;
        int sum = 4;
        System.out.println(productSmallPair(arr,n,sum));

    }

    public static int productSmallPair (int[] arr, int n, int sum){
        n = arr.length;
        ArrayList<Integer> products = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    continue;
                }
                if(arr[i] + arr[j] <= sum){
                    products.add(arr[i] * arr[j]);
                }
            }
        }

        Collections.sort(products);
        return products.get(0);
    }
}
