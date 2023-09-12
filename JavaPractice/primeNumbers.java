import java.util.*;
public class primeNumbers {
    static void isPrime(int num){
        int count = 0;
        for(int i =1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }

}
