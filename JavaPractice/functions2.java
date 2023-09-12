import java.util.*;
public class functions2 {

    public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static int calculateProduct(int a ,int b){
        return a*b;
    }
    public static void printFactorial(int n){
        //Loop
        int factorial = 1;
        for(int i=n; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the number for factorial calculation: ");
        int c = sc.nextInt();

        int sum = calculateSum(a,b);


        System.out.println("Sum of the two numbers is: " + sum);
        System.out.println("product of two numbers is " + calculateProduct(a,b));
        System.out.print("factorial calcuation is ");
        printFactorial(c);


    }
}
