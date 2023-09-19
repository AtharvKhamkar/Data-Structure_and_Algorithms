//find the ceiling number of a given target in an array
//we have to find smallest(nearest) greatest number
public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    //return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //if the target is greater than the greatest number in that array
        if(target > arr[arr.length-1]){
            return -1;
        }

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
        return arr[start];
    }
}
