public class arraySortedOrNot {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        boolean ans = sortedOrNot(arr);
        System.out.println(ans);
        boolean newAns = sortedRec(arr,0);
        System.out.println(newAns);

    }

    public static boolean sortedOrNot(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;

            }
        }
        return true;
    }

    public static boolean sortedRec(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sortedRec(arr,index+1);
    }
}
