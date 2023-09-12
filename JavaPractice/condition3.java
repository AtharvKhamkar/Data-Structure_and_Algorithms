import java.util.*;
public class condition3 {
    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }

    }
}
