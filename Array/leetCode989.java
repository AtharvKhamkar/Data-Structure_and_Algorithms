
//https://leetcode.com/problems/add-to-array-form-of-integer/description/
//The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
import java.lang.Math;
import java.util.Arrays;
import java.util.*;

public class leetCode989 {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num,k));

    }
//To sum each element in the array
    public static int sum(int[] num , int k){
        int sum = 0;
        int j = 0;
        for (int index = num.length-1; index >= 0; index--) {
            sum =sum + (int) (num[index] * Math.pow(10,j));
            j++;



        }
        int total_sum = sum + k;
        return total_sum;
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int summation = sum(num,k);
        String str = Integer.toString(summation);
        int size = str.length();
        List<Integer> newOutputList = new ArrayList<Integer>();


        int[] output = new int[size];
        List<Integer> outputlist = new ArrayList<Integer>();
        for (int index = size-1; index >=0 ; index--) {
            int remainder = summation %10;
            outputlist.add(remainder);
            summation = summation / 10;

        }

        //for reversing the arraylist
        Collections.reverse(outputlist);

        return outputlist;



    }



}
