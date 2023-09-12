import java.util.*;
public class simpleArray2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];

        //Input
        for(int i=0;i<size;i++){
            System.out.println("Enter element :" + i);
            number[i] = sc.nextInt();
        }
        System.out.println("The final Array is : ");

        //output
        for(int i=0;i<size;i++){
            System.out.print(number[i]+ " ");
        }
    }
}
