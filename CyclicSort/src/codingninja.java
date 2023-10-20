import java.util.ArrayList;
import java.util.Arrays;

public class codingninja {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,3};
        System.out.println((findDuplicates(arr)));

    }
    public static ArrayList < Integer > findDuplicates(int[] arr) {
        // Write your code here.
        ArrayList<Integer> answer = new ArrayList<>();

        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j] != j){
                answer.add(arr[j]);
            }
        }
        return answer;
    }


    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
