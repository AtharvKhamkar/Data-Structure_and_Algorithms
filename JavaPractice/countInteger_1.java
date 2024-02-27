import java.util.*;
public class countInteger_1 {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        countTimes(inputNumber);


    }

    public static void  countTimes(int num){
        int original = num;
        int count = 0;
        while(num > 0){
            if(num % 10 ==3){
                count++;
            }
            num = num / 10;
        }
        System.out.println(3+ " is appered "+ count + " times in a number");
    }
}
