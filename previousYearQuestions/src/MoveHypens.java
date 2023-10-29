import java.util.*;
import java.lang.*;
public class MoveHypens {
    public static void main(String[] args){
        String str = "String-Compare";
        int n = str.length();
        System.out.println(moveHyphen(str,n));

    }

    public static String moveHyphen (String str, int n){
        StringBuilder sb = new StringBuilder();
        n = str.length();
        if(str.isEmpty()){
            return null;
        }

        for(int i=0;i<n;i++){
            if(str.charAt(i) == '-'){
                sb.insert(0,str.charAt(i));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
