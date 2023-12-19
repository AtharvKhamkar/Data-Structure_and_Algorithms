import java.util.*;
public class leetCode74_1 {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(Arrays.toString(searaachMatrix(matrix,16)));

    }

    public static int[] searaachMatrix(int[][] arr,int target){
        int[] ans = {-1,-1};
        int r = 0;
        int c = arr[0].length-1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                ans[0] = r;
                ans[1] = c;
                return ans;
            } else if (arr[r][c] < target) {
                r++;
            }else{
                c--;
            }
        }
        return ans;
    }
}
