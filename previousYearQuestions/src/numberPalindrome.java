import java.util.*;
import java.lang.*;
public class numberPalindrome {
    public static void main(String[] args){
        int a = 100;
        int b = 200;
        for(int i=a;i<=b;i++){
            if(isPalindrome(i,a)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPalindrome(int num,int higher) {
        ArrayList<Integer> array = new ArrayList<>();
        while (num > 0) {
            array.add(num % 10);
            num = num / 10;
        }
        for (int i = 0; i < array.size(); i++) {
            int start = array.get(i);
            int end = array.get(array.size() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
