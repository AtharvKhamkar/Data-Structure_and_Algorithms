import java.util.*;
import java.lang.*;
public class fineNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        System.out.println("Enter the number of elements in array a");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println("Enter the number of elements in array b");
        int m = sc.nextInt();
        System.out.println("Enter the elements in array b");
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }


        int result = findFineNumber(a,b);
        System.out.println(result);




    }

    public static int findFineNumber(List<Integer> a, List<Integer> b){
        int MAX1 = findMax(a);
        int MAX2 = findMax(b);
        int finalMin = 0;
        if(MAX1 > MAX2){
            finalMin = findMin(b);
            return MAX1 - finalMin;
        }else{
            finalMin = findMin(a);
            return MAX2 - finalMin;

        }
    }

    public static int findMax(List<Integer> arr){
        int MAX = 0;
        for(int i=0;i<arr.size();i++){
            if(MAX < arr.get(i)){
                MAX = arr.get(i);
            }
        }
        return MAX;
    }
    public static int findMin(List<Integer> arr){
        int MIN = Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(MIN > arr.get(i)){
                MIN = arr.get(i);
            }
        }
        return MIN;
    }
}
