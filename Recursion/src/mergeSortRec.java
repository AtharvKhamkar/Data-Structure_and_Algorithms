import java.util.Arrays;

public class mergeSortRec {
    public static void main(String[] args){
        int[] arr = {1};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] arr1 = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] arr2 = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return sortedArray(arr1,arr2);
    }

    public static int[] sortedArray(int[] arr1,int[]arr2){
        int[] sorted = new int[arr1.length+arr2.length];

        int i=0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                sorted[k] = arr1[i];
                i++;
            }else{
                sorted[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            sorted[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            sorted[k] = arr2[j];
            j++;
            k++;
        }
        return sorted;
    }


}
