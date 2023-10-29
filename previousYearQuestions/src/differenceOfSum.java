import java.util.*;
import java.lang.*;

public class differenceOfSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the range");
        int m = sc.nextInt();
        System.out.println(differenceSum(m,n));
    }

    public static int differenceSum (int m, int n){
        int divisibleNumbers = 0;
        int notDivisibleNumber = 0;
        for(int i=0;i<=m;i++){
            if(i % n == 0){
                divisibleNumbers += i;
            }else{
                notDivisibleNumber += i;
            }
        }

        return Math.abs(divisibleNumbers - notDivisibleNumber);
    }
}
