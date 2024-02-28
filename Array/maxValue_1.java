public class maxValue_1 {
    public static void main(String[] args){
        int[] example = {1,3,5,7,18};
        int result = maxNumber(example);
        int finalResult = maxInRange(example,0,2);
        System.out.println(result);
        System.out.println(finalResult);

    }

    public static int maxNumber(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxInRange(int[] arr,int start,int end){
        int max = arr[start];
        for (int i=start+1;i<=end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
