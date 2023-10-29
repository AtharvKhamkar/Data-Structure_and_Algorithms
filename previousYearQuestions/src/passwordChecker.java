import java.util.*;
import java.lang.*;
public class passwordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        int n = str.length();
        System.out.println(checkPassword(str,n));

    }

    public static int checkPassword (String str, int n){
        int digCount = 0;
        int capCount = 0;
        n = str.length();
        if(n < 4){
            return 0;
        }
        if(str.charAt(0) >= '0' && str.charAt(0) <= '9'){
            return 0;
        }
        for(int i=0;i<n;i++){
            if((str.charAt(i) == ' ') || (str.charAt(i) == '/')){
                return 0;
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digCount++;
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                capCount++;
            }
        }

        if(capCount >=1 && digCount >=1){
            return 1;
        }else{
            return 0;
        }

    }

}
