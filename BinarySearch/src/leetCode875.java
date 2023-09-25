//https://leetcode.com/problems/koko-eating-bananas/description/
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//
//Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//
//Return the minimum integer k such that she can eat all the bananas within h hours.

import java.util.Arrays;
import java.math.*;

public class leetCode875 {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles,6));


    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int pile:piles){
            max = Math.max(max,pile);
        }
        int start = 1;
        int end = max;

        while(start<end){
            int mid = start + (end-start)/2;
            if(koko(mid,piles)>h){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return start;
    }


    public static int koko(long num,int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= (int) Math.ceil((double) arr[i]/num);

        }
        return sum;
    }
}
