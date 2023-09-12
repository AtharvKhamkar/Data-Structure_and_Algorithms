import java.util.*;
public class twoDimArray {
    public static void main(String[] args) {
        System.out.println("Enter the elements of 2D Array: ");
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        System.out.println("Enter the elements in the array: ");

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }
        }
        //for displaying the array
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            System.out.println(Arrays.toString(arr[row]));
        }


    }

}
