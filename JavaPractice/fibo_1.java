import java.util.*;
public class fibo_1 {
    public static void main(String[] args){
        System.out.println("Enter the position of a number in a fibbonacci series");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fiboNumber(num);

    }

    public static void fiboNumber(int num){
        int p = 0;
        int i = 1;
        int count = 2;
        while(count <= num){
            int temp = i;
            i = p + i;
            p = temp;
            count++;
        }

        System.out.println(i);
    }
}
