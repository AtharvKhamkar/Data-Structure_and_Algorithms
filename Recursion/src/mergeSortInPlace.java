import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        inplaceMerge(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void inplaceMerge(int[] arr,int s,int e){
        if(e - s <= 1){
            return;
        }

        int mid = (s + e) / 2;

        inplaceMerge(arr,s,mid);
        inplaceMerge(arr,mid,e);

        sortedArray(arr,s,mid,e);


    }

    public static void sortedArray(int[] arr,int s,int mid,int e){
        int[] sorted = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i<mid && j<e){
            if(arr[i] < arr[j]){
                sorted[k] = arr[i];
                i++;
            }else{
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            sorted[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            sorted[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < sorted.length; l++) {
            arr[s+l] = sorted[l];

        }
    }


}
