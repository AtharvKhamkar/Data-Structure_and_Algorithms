import java.util.*;
import java.lang.*;

public class binaryOperation {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String");
       String str = sc.next();
       System.out.println(operationsBinaryString(str));
    }

    public static int operationsBinaryString (String str){
        int exp = 0;
        if(str.isEmpty()){
            return -1;
        }
        for(int i=0;i<str.length()-1;i++){
            exp = str.charAt(0) -'0';
            if(str.charAt(i) == 'A'){
                exp = exp & str.charAt(i+1) - '0';
            }
            if(str.charAt(i) == 'B'){
                exp = exp | str.charAt(i+1) - '0';
            }
            if(str.charAt(i) == 'C'){
                exp = exp ^ str.charAt(i+1) - '0';
            }

        }
        return exp;
    }
}
