//https://leetcode.com/problems/kth-missing-positive-number/description/
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//Return the kth positive integer that is missing from this array.

import java.util.*;
public class leetCode1539 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr,k));

    }

    public static int findKthPositive(int[] arr, int k) {
        int finalAns = elementFoundOrNot(arr,k);
        return finalAns;
    }

    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;

            }else if(target > arr[mid]){
                start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }

    public static int elementFoundOrNot(int arr[], int k){
        ArrayList<Integer> newArray = new ArrayList<>();
        int target = 1;
        int count = k;
        for (int i = 1; i < arr[arr.length-1]; i++) {
            target = i;

            int ans = binarySearch(arr,target);
            if(ans == -1){
                newArray.add(target);
            }

        }
            for (int j = arr[arr.length-1]+1; j <= arr[arr.length-1] + k; j++) {
                newArray.add(j);

            }

        return newArray.get(k - 1);
    }
}
