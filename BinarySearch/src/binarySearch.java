public class binarySearch {
    public static void main(String[] args) {
        //int arr = { 0,   1,   2, 3, 4, 5, 6, 7,  8,  9,  10, 11, 12}
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 89;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    //return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

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
    }
}
