import java.util.*;
import java.lang.*;
public class countCarray {
    public static void main(String[] args){
        int num1 = 23;
        int num2 = 563;
        System.out.println(numberOfCarries(num1,num2));

    }

    public static int numberOfCarries (int num1, int num2){
        int count = 0;
        while(num1>0 | num2>0){
            if(num1%10 + num2%10 >= 10){
                count++;
                num1 = num1/10;
                num1++;
                num2 = num2/10;
            }else{
                num1 = num1/10;
                num2 = num2/10;
            }
        }
        return count;
    }
}
