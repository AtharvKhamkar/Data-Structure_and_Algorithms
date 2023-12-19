//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
//A conveyor belt has packages that must be shipped from one port to another within days days.
//
//The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
//
//Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

import java.math.*;
public class leetCode1011 {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights,5));

    }

    public static int shipWithinDays(int[] weights, int days) {
        int MAX = Integer.MIN_VALUE;
        for(int weight:weights){
            MAX = Math.max(MAX,weight);
        }
        int start = MAX;
        int end = sum(weights);

        while(start<end){
            int mid = start + (end-start)/2;

            if(findDays(weights,mid)> days){
                start = mid + 1;
            }else{
                end=mid;
            }
        }
        return start;

    }

    public static int sum(int[] weights){
        int sum =0;
        for (int i = 0; i < weights.length; i++) {
            sum+=weights[i];

        }
        return sum;
    }



    public static int findDays(int[] weights,int capacity){
        int load = 0;
        int days = 1;
        for (int i = 0; i < weights.length; i++) {
            load = load + weights[i];
            if(load > capacity){
                days = days+1;
                load=weights[i];

            }
        }
        return days;
    }
}
