//https://leetcode.com/problems/kth-missing-positive-number/description/
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//Return the kth positive integer that is missing from this array.

import java.util.*;
public class leetCode1539 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(kthmissing(arr,k));

    }

    public static int kthmissing(int[] arr,int k){
        int ans = 0;
        int count = 0;
        int max = findMax(arr);
        for(int i = 1; i <= max + k ; i++){
            ans = binarySearch(arr,i);
            if(ans == -1){
                count++;
                if(count == k){
                    return i;
                }
            }

        }
        return -1;


    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return arr[max];
    }

    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
