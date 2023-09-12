//Find the fibbonaci series till the Nth number.
// 0 1 1 2 3 5 8 13 21 .....
import java.util.*;
public class fibo {
    public  static void main(String[] args){
        System.out.println("Enter the Nth index in the series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = 0;
        int i = 1;
        int count = 2;

        while(count<=n){
            int temp = i;
            i = p + i;
            p = temp;
            count++;

        }
        System.out.println(i);

    }
}
