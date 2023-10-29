import java.util.*;
import java.lang.*;
public class maximunExponent {
    public static void main(String[] args){
        System.out.println(maxExponents(7,12));

    }

    public static int maxExponents (int a, int b){
        int ans = 0;
        int maxCount = exponent(a);
        for(int i=a;i<=b;i++){
            int checkExpo = exponent(i);
            if(checkExpo > maxCount){
                maxCount = checkExpo;
                ans = i;
            }
        }
        return ans;

    }

    public static int exponent(int num){
        int count = 0;
        if(num % 2 == 1){
            return 0;
        }else{
            while(num % 2 != 1){
                count++;
                num = num / 2;
            }
        }
        return count;
    }
}
