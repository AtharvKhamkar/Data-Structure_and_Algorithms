import java.util.*;
public class armStrongNumber_1 {
    public static void main(String[] args){
        System.out.println("Enter the number to check it is armstrong number or not");
        Scanner sc = new Scanner(System.in);
        int checkNumber = sc.nextInt();
        boolean result = armNumber(checkNumber);
        System.out.println("It is armstrong number "+ result);

    }

    public static int order(int num){
        int n = 0;
        while(num != 0){
            n++;
            num = num / 10;
        }
        return n;
    }

    public static boolean armNumber(int num){
        int digits = order(num);
        int original = num;
        int total = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            total = total + (int)Math.pow(rem,digits);
            num = num / 10;
        }

        return total == original;
    }
}
