import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class fineNumber_1 {
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
        int max_diff = 0;
        for(int i:a){
            for(int j:b){
                int diff = Math.abs(i-j);
                if(max_diff < diff){
                    max_diff = diff;
                }
            }
        }
        return max_diff;
    }
}
