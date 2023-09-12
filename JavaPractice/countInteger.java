//Programe to count how many times the "3" occured in the number.

import java.util.*;
public class countInteger {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while(n>0){
            if(n%10==3){
                count++;
            }
            n = n/10;
        }
        System.out.println("3 occured in the number "+count+" times");
    }
}
