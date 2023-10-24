import java.util.Arrays;

public class nextSmall {
    public static void main(String[] args){
        int[] a = {10,5,4,5,3,2,1};
        System.out.println(Arrays.toString(nextSmallerNumber(a)));

    }

    public static int[] nextSmallerNumber(int[] a){
        int[] finalAns = new int[a.length];
        int smaller = 0;
        for(int i=0;i<a.length;i++){
            if(i == a.length-1){
                finalAns[a.length-1] = -1;
            }
            if(i<a.length-1 && a[i] > a[i+1]){
                finalAns[i] = a[i+1];
            }else if(i<a.length-2){
                finalAns[i] = finalSmallest(a,i+1);
            }
        }
        return finalAns;
    }

    public static int finalSmallest(int[] a,int start){
        int smallest = a[start];
        for(int j=start+1;j<a.length;j++){
            if(smallest > a[j]){
                smallest = a[j];
            }
        }
        return smallest;
    }
}
