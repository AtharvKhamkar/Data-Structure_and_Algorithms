//https://leetcode.com/problems/spiral-matrix/description/
//Given an m x n matrix, return all elements of the matrix in spiral order.
import java.util.*;
public class leetCode54 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output =new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        int rmin = 0;
        int cmin = 0;
        int rmax = n-1;
        int cmax = m-1;
        int counter = 1;

        while(counter <= n*m){
            //upper bound
            for(int col=cmin; col<= cmax && counter<=n*m;col++){
                output.add(matrix[rmin][col]);
                counter++;
            }
            rmin++;

            //right bound
            for(int row = rmin; row<=rmax && counter<=n*m;row++){
                output.add(matrix[row][cmax]);
                counter++;
            }
            cmax--;

            //for bottom bound
            for(int col=cmax; col>=cmin && counter<=n*m; col--){
                output.add(matrix[rmax][col]);
                counter++;
            }
            rmax--;

            //for left bound
            for(int row=rmax; row>=rmin && counter <= n*m; row--){
                output.add(matrix[row][cmin]);
                counter++;
            }
            cmin++;



        }
        return output;

    }

}
