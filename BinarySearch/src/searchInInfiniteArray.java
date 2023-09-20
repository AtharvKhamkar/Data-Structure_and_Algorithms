//finding the index of the target in the imaginary infinite array
//finding the index without using the arr.length method bcz we are assuming it is an infinite array and we dont know the size of it
public class searchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }



    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start,int end) {

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
    }
}
