import java.util.*;

public class armStrongNumber {

    public static boolean armstrongNumber(int num) {
        int original =num;
        int rem;
        int sum = 0;
        int cube = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            cube = rem * rem * rem;
            sum = sum + cube;

        }
        return sum == original;
    }


    public static void main(String[] args){
//        System.out.println("Enter the 3digit number: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean result = armstrongNumber(number);
//        System.out.println("It is a armstrong number: "+ result);

        for(int i=100;i<1000;i++){
            if(armstrongNumber(i)){
                System.out.print(i + " ");
            }
        }

    }

}
