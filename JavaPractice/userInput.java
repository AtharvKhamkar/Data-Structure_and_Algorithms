import java.util.*;
public class userInput {
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String fullname = sc.nextLine();
        System.out.println(name);

        //nextInt() => To take input in integer form
        //nextFloat() => To take input in floating form

        System.out.println(fullname);
    }
}
