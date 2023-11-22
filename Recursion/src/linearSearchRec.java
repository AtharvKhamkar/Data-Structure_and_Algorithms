import java.util.ArrayList;

public class linearSearchRec {
    public static void main(String[] args){
        int[] arr = {3,2,18,18,9};
        System.out.println(linSearchRec(arr,25,0));
        System.out.println(allTarget(arr,18,0));

    }

    public static int linSearchRec(int[]arr,int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return linSearchRec(arr,target,index+1);
    }

    //function to return multiple index in an array
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> allTarget(int[] arr, int target, int index){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return allTarget(arr,target,index+1);
    }
}
