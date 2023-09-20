//To find the greatest number in the sorted array or rotatory sorted array
//algorithm as follows

public class gratestNumberBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            //4 conditions to find pivot element
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}
