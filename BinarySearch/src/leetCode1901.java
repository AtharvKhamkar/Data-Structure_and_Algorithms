import java.util.Arrays;

public class leetCode1901 {
    public static void main(String[] args) {
        int[][] mat = {
                {41,8,2,48,18},
                {16,15,9,7,44},
                {48,35,6,38,28},
                {3,2,14,15,33},
                {39,36,13,46,42}

        };
        System.out.println(Arrays.toString(findPeakGrid(mat)));

    }

    public static int[] findPeakGrid(int[][] mat) {
        int MAX = Integer.MIN_VALUE;

        int r = mat.length;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(mat[i][j] > MAX){
                    MAX = mat[i][j];
                }

            }
        }

        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j]==MAX){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{-1,-1};
    }

}
