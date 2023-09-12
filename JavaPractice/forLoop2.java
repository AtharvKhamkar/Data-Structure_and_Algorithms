import java.util.*;
public class forLoop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("The table of " + n);

        for(int i = 1;i < 11; i++){
            System.out.println(n * i);
        }
    }
}
