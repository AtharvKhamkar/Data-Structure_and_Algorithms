public class leetCode1095_1 {
    public static void main(String[] args) {

    }

    int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr,target);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }else{
            return orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
    }
    public static int peakIndexInMountainArray(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int orderAgnosticBS(int[] arr, int target,int start,int end) {

        //find weather array is sorted or not
        boolean isAsc = arr[start] < arr[end];

        if (isAsc) {
            while (start <= end) {

                //find the middle element
                int mid = start + (end - start) / 2;   //similar to mid = (start + end)/2

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            // element not found
            return -1;
        } else {
            while (start <= end) {

                //find the middle element
                int mid = start + (end - start) / 2;   //similar to mid = (start + end)/2

                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            // element not found
            return -1;

        }
    }
}
