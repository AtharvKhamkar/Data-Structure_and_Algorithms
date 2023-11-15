import java.util.*;
import java.lang.*;
public class tableSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(num * i + " ");
            sum += num * i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
