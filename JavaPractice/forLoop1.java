import java.util.*;
public class forLoop1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of N numbers is "+ sum);
    }
}
