import java.util.*;
import java.lang.*;
public class findAutoCount {
    public static void main(String[] args){
        String n = "1210";
        System.out.println(findautoCount(n));

    }

    public static int findautoCount (String n){
        int count = 0;
        for(int i=0;i<n.length();i++){
            int ch = n.charAt(i) - '0';
            if(ch != 0){
                count++;
            }
        }
        return count;
    }


}
