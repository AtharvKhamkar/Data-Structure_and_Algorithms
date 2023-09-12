import java.util.*;
public class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();


        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index :" + i);
            arr.add(sc.nextInt());

        }
        System.out.println("The minimum element is "+minimum(arr));

    }

    static int minimum(ArrayList<Integer> arr){
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i)<ans){
                ans = arr.get(i);

            }

        }
        return ans;

    }
}
