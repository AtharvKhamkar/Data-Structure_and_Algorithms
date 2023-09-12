import java.util.*;
public class findNumInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the element:"+i);
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the element want to search:");
        int search = sc.nextInt();

        for(int i=0; i<number.length; i++){
            if(number[i] == search){
                System.out.println("Element found at the index" + i);
            }
        }

    }
}
