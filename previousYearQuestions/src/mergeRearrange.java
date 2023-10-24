import java.util.*;
import java.lang.*;
public class mergeRearrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sc.next();
        System.out.println("Enter the second String");
        String str2 = sc.next();
        System.out.println(mergeString(str1,str2));

    }

    public static String mergeString(String str1, String str2){
        StringBuilder sb = new StringBuilder();

        sb.append(str1);
        for(int i=str2.length()-1;i>=0;i--){
            sb.append(str2.charAt(i));
        }
        int len = sb.length();

        for(int j=0;j<len;j++){
            int firstChar = sb.charAt(j);
            int secondChar = sb.charAt(len-j-1);
            if(firstChar > secondChar){
                swap(sb,j,len-j-1);
            }
        }
        return sb.reverse().toString();
    }

    public static void swap(StringBuilder str,int first,int second){
        char temp = str.charAt(first);
        str.setCharAt(first,str.charAt(second));
        str.setCharAt(second,temp);
    }
}
