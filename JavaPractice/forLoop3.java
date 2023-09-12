import java.util.*;
public class forLoop3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number");
        int n = sc.nextInt();
        System.out.println("The even numbers until : " + n);

        for(int i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
