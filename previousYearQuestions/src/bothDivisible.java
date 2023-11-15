import java.util.*;
import java.lang.*;
public class bothDivisible {
    public static void main(String[] args){
        System.out.println(Calculate(100,160));

    }

    public static int Calculate (int m, int n){
        int sum = 0;
        for(int i=m;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
