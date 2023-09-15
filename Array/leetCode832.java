
//https://leetcode.com/problems/flipping-an-image/description/
//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].

import java.util.*;

public class leetCode832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
       int[][] result = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(result));


    }

    public static void flip(int arr[]){
        int n = arr.length;
        int i=0;
        int j = n -1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void invert(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }


    public static int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        int m = image[0].length;

        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            flip(image[i]);
            invert(image[i]);
            ans[i] = image[i];

        }
        return ans;

    }
}
