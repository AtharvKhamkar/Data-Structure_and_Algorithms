import java.util.*;
import java.lang.*;
public class replaceChars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Enter the character1");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter the character2");
        char ch2 = sc.next().charAt(0);
        System.out.println(replaceChar(str,ch1,ch2));

    }

    public static String replaceChar (String str, char ch1, char ch2){
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch1){
                res = res + ch2;
            }else if(str.charAt(i) == ch2){
                res = res + ch1;
            }else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }
}
