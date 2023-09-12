import java.util.*;

public class calculatorSwitch {
    public static void main(String[] args){
        System.out.println("This is a simple calculator");
        System.out.println("Choose operations:\n1.Addition. \n2.Subtraction \n3.Multiplication \n4.Division");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for operation");
        System.out.println("Number 1:");
        int a = sc.nextInt();
        System.out.println("Number 2:");
        int b = sc.nextInt();
        System.out.println("Choose option from operation");
        int operation = sc.nextInt();

        //operations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        float division = a / b;
        System.out.println("Result:");


        switch(operation){
            case 1:
                System.out.println(addition);
                break;
            case 2:
                System.out.println(subtraction);
                break;
            case 3:
                System.out.println(multiplication);
                break;
            case 4:
                System.out.println(division);
                break;
            default:
                System.out.println("Invalid Input");

        }

    }
}
