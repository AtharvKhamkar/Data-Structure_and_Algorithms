import java.util.*;

public class condition1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("It is a Even Number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }
}
