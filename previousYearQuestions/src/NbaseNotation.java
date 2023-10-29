import java.util.*;
import java.lang.*;
public class NbaseNotation {
    public static void main(String[] args){
        int n = 21;
        int num = 5678;
        System.out.println(dectoNBase(n,num));

    }

    public static String dectoNBase (int n, int num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int remainder = num % n;
            if(remainder >= 0 && remainder <= 9){
                sb.append(remainder);
            }
            if(remainder >= 10){
                sb.append((char)(55+remainder));
            }
            num = num/n;
        }
        return sb.reverse().toString();
    }
}
