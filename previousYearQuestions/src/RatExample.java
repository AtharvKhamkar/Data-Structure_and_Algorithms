public class RatExample {
    public static void main(String[] args){
        int r = 7;
        int unit = 2;
        int[] arr = {2,8,3,5,7,4,1,2};
        int n = arr.length;
        System.out.println(solve(r,unit,arr,n));

    }

    public static int solve (int r, int unit, int[] arr, int n){
        if(arr == null){
            return -1;
        }
        int required = r * unit;
        int calculated = 0;
        for(int i=0;i<n;i++){
            calculated += arr[i];
            if(calculated > required){
                return i+1;
            }
        }
        return 0;
    }
}
