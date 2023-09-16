
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
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num,k));

    }

    public static int sum(int[] num , int k){
        int sum = 0;
        int j = 0;
        for (int index = num.length-1; index >= 0; index--) {
            sum =sum + (int) (num[index] * Math.pow(10,j));
            j++;



        }
        return sum+k;
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int summation = sum(num,k);

        List<Integer> output = new ArrayList<>(num.length);
        for (int index = num.length-1; index >=0 ; index--) {
            int remainder = summation %10;
            output.add(index,remainder);
            summation = summation / 10;



        }
        return output;



    }



}
