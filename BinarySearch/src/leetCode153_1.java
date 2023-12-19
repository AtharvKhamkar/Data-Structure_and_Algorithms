public class leetCode153_1 {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findMinRotated(arr));

    }

    public static int findMinRotated(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(end > mid && arr[mid] > arr[mid+1]){
                return arr[mid + 1];
            }
            if(start < mid && arr[mid] > arr[mid-1]){
                return arr[mid -1];
            }
            if(arr[start] <= arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
