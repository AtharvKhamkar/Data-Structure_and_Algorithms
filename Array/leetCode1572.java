//https://leetcode.com/problems/matrix-diagonal-sum/
//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

public class leetCode1572 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));

    }

    public static int primaryMatrix(int[][] mat){
        int n = mat.length;
        int sum = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if((row == col) || (row + col == n-1)){
                    sum = sum + mat[row][col];
                }

            }

        }
        return sum;
    }

//    public static int secondaryMatrix(int[][] mat){
//        int n = mat.length;
//        int sum = 0;
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                if(row + col == n-1){
//                    if(row == col){
//                        continue;
//                    }
//                    sum = sum + mat[row][col];
//                }
//
//            }
//
//        }
//        return sum;
//    }

    public static int diagonalSum(int[][] mat) {
        int result = primaryMatrix(mat);
        return result;

    }
}
