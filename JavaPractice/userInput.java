import java.util.*;
public class userInput {
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        System.out.println(fullName);

    }
}
