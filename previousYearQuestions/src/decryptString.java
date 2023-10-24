import java.util.*;
import java.lang.*;
public class decryptString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(decryptStr(str));

    }

    public static String decryptStr(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            int ch = (int)str.charAt(i);
            int firstPosition = ch - (int)'a';
            int last = (int)'z';
            int second = last - firstPosition;
            char replaced = (char) second;
            sb.append(replaced);
        }
        return sb.toString();
    }
}
