import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.
public class leetCode1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies =3;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] > max){
                max = arr[index];
            }
        }
        return max;

    }
    public static boolean checkMaxOrNot(int[] candies, int extraCandies){
        int max_limit = findMax(candies);
        for (int index = 0; index < candies.length; index++) {
            if(candies[index] + extraCandies >= max_limit){
                return true;
            }
            return false;

        }
        return false;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max_limit = findMax(candies);
        for (int index = 0; index < candies.length; index++) {
            boolean ans;
            if (candies[index] + extraCandies >= max_limit) {
                ans = true;
                output.add(ans);
            } else {
                ans = false;
                output.add(ans);
            }


        }
        return output;



    }



}
