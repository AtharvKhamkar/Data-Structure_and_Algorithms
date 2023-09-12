import java.util.*;

public class largetestNumber{
    public static void main(String[] args){
        System.out.println("Enter the three numbers: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max =c;
//        }
//
//        System.out.println("Largest number is "+ max);

        if(a > b){
            if(a > c){
                System.out.println(a +" is a largest number");
            }
        }else if(b > a){
            if(b > c){
                System.out.println(b + " is a largest number");
            }
        }
        System.out.println(c + " is a largest number");

    }
}