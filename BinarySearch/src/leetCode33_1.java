public class leetCode33_1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = findPivot(arr);

        int firsttry = binarySearch(arr,target,0,pivot);
        int secondTry = binarySearch(arr,target,pivot,arr.length-1);

        if(firsttry != -1){
            System.out.println(firsttry);
        }else{
            System.out.println(secondTry);
        }

    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }else if(start < mid && arr[mid] < arr[mid-1]){
                return mid -1;
            }else{
                if(arr[start] > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;

            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }



}
