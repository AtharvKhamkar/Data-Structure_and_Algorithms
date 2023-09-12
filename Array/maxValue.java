
public class maxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,4));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static int maxRange(int[] arr,int start,int end){
        //adding edge cases
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start+1; i <= end ; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
