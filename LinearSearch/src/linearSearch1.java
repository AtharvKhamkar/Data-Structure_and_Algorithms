import java.util.*;
public class linearSearch1{
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
        boolean ans = linearSearch(list,target);
        if(!ans){
            System.out.println("Element is not in arraylist");
        }
        else{
            System.out.println("Element is in the arrayList");
        }

    }
    static boolean linearSearch(ArrayList<Integer> arr, int target){

        if(arr.isEmpty()){
            return false;
        }
        for(int index=0; index<arr.size(); index++){
            int element = arr.get(index);
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
