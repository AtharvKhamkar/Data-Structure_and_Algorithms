import java.util.*;
public class reverseNumber {
    public static void main(String[] args){
        System.out.println("Enter the number for reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rem = 0;
        int reverse = 0;
        while(n > 0){
            rem = n%10;
            n = n/10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}
