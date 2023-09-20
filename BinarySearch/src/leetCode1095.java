//https://leetcode.com/problems/find-in-mountain-array/description/
//(This problem is an interactive problem.)
//
//You may recall that an array arr is a mountain array if and only if:
//
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
//
//You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
//
//MountainArray.get(k) returns the element of the array at index k (0-indexed).
//MountainArray.length() returns the length of the array.
//Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

public class leetCode1095 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(peakIndexInMountainArray(arr,target));

    }

    public static int peakIndexInMountainArray(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        int newEnd = end;
        int newStart = 0;
        int[] newArray = new int[newEnd-newStart+1];
        for (int i = 0; i <= newEnd; i++) {
            newArray[i] = arr[i];
        }
        return binarySearch(newArray,target);

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            //find the middle element
            int mid = start + (end - start)/2;   //similar to mid = (start + end)/2

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        // element not found
        return -1;
    }



}
