public class orderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {89,76,65,43,32,21,12,1};
        int target = 1;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find weather array is sorted or not
        boolean isAsc = arr[start] < arr[end];

        if(isAsc){
            while(start <= end){

                //find the middle element
                int mid = start + (end - start)/2;   //similar to mid = (start + end)/2

                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }

            // element not found
            return -1;
        }else{
            while(start <= end){

                //find the middle element
                int mid = start + (end - start)/2;   //similar to mid = (start + end)/2

                if(target > arr[mid]){
                    end = mid - 1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }

            // element not found
            return -1;

        }
    }
}
