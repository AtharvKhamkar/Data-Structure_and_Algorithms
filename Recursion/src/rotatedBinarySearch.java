public class rotatedBinarySearch {
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(binarySearch(arr,0,arr.length-1,4));

    }

    public static int binarySearch(int[] arr,int start,int end,int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }

            //if the target is lie in the first sorted half
            if(arr[start] <= arr[mid]){
                if((target<=arr[mid]) && (target >= arr[start])){
                    return binarySearch(arr,start,mid-1,target);
                }else{
                    return binarySearch(arr,mid+1,end,target);
                }

                //if the target lie in the second half of the sorted array
                //if the target lie in the second half of the sorted array
            }else{
                if((target>=arr[mid]) && (target<=arr[end])){
                    return binarySearch(arr,mid+1,end,target);
                }else{
                    return binarySearch(arr,start,mid-1,target);
                }
            }
        }
}
