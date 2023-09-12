import java.util.*;
public class primeNumbers2 {
    public static void main(String[] args){
        System.out.println("Enter the N number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The prime numbers between 1 to " + n + " are follows:");

        for(int j = 2; j<= n; j++){
            int count = 0;
            for(int i = 1; i <= j; i++){
                if(j % i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(j+"  ");
            }
        }
    }
}
