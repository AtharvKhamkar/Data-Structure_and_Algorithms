import java.sql.SQLOutput;
import java.util.*;
public class searchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = sc.next();

        //Taking Input target character
        System.out.println("Enter the target character: ");
        char target = sc.next().charAt(0);

        //Taking input starting range
        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();

        //Taking input end range
        System.out.println("Enter the ending range:");
        int end = sc.nextInt();

        int ans = searchRange(name,target,start,end);
        if(ans == -1){
            System.out.println("target character is not found");
        }
        else{
            System.out.println("target character found at index :"+ans);
        }

    }

    static int searchRange(String str,char target,int start,int end){
        if(str.isEmpty()){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(target == str.charAt(i)){
                return i;
            }

        }
        return -1;
    }
}
