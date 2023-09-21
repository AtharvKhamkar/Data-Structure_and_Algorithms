public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {15,18,20,3,6,12};
        System.out.println(rotationCount(arr));
        
    }
    
    public static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] > arr[mid+1]){
                return mid+1;
            } else if (arr[mid]<arr[mid-1]) {
                return mid-1+1;
            } else if (arr[start] > arr[mid]) {
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
