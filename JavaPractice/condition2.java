import java.util.*;

public class condition2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a First number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        if ( a == b){
            System.out.println("It a equal number");
        }else if(a > b){
            System.out.println("First number is greater number");
        }else{
            System.out.println("Second number is greater number");
        }
    }
}
