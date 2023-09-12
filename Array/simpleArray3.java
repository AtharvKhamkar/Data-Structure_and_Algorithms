import java.util.*;
public class simpleArray3 {
    public static void main(String[] args) {
        //programme to take array in a form of non primivtive data type
        System.out.println("Enter the size of the array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] str = new String[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
