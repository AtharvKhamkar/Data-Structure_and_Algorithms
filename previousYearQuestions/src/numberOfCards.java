import java.util.*;
import java.lang.*;
public class numberOfCards {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of levels");
        int n = sc.nextInt();
        System.out.println(calculateCards(n));

    }

    public static int calculateCards(int n){
        int sum = 0;
        if(n == 0){
            return -1;
        }
        for(int i=n*2;i>=2;i=i-2){
            sum += i;
        }

        for(int j=n-1;j>=1;j--){
            sum += j;
        }

        return sum%1000007;
    }
}
