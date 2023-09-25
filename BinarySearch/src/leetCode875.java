//https://leetcode.com/problems/koko-eating-bananas/description/
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//
//Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//
//Return the minimum integer k such that she can eat all the bananas within h hours.

import java.util.Arrays;

public class leetCode875 {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(Arrays.toString(speedsArray(piles)));

    }

    public static int findMax(int[] piles){
        int MAX = 1;
        int n = piles.length;

        for (int i = 0; i < n; i++) {
            if(piles[i] > MAX){
                MAX = piles[i];
            }

        }
        return MAX;
    }

    public static int[] speedsArray(int[] piles){
        int MaxElement = findMax(piles);
        int[] expSpeed = new int[MaxElement];

        int speed = 1;
        for (int i = 0; i < expSpeed.length; i++) {
            expSpeed[i] = speed;
            speed++;
        }
        return expSpeed;
    }
}
