import java.util.*;
public class newLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking size of the array as input
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        //Taking elements in the array as  input
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<size;i++){
            System.out.println("Enter the element at: " + i);
            list.add(sc.nextInt());
        }

        //Input as a target Element
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int ans = linearSearch(list,target);
        if(ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+ans);
        }

    }
    static int linearSearch(ArrayList<Integer> arr, int target){

        if(arr.isEmpty()){
            return -1;
        }
        for(int index=0; index<arr.size(); index++){
            int element = arr.get(index);
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
