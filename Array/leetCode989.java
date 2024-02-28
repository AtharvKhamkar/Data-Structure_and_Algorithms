
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
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num,k));

    }
//To sum each element in the array
public static int summation(int[] num,int k){
    int total = 0;
    int j = 0;
    for(int i=num.length-1;i>=0;i--){
        total = total + (int)(num[i] * Math.pow(10,j));
        j++;
    }

    total = total + k;

    return total;
}
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int total = summation(num,k);

        List<Integer> outputList = new ArrayList<Integer>();
        int rem = 0;
        while(total != 0){
            rem = total % 10;
            outputList.add(rem);
            total = total / 10;
        }

        Collections.reverse(outputList);
        return outputList;



    }



}
