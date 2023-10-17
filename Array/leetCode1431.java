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

    public static int findMax(int[] candies){
        int MAX = candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>MAX){
                MAX = candies[i];
            }
        }
        return MAX;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = findMax(candies);

        ArrayList<Boolean> result = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= maximum){
                result.add(true);    //thing to remember arraylist uses .add method to add elements and stringBuilder uses .append method to add characters
            }else{
                result.add(false);
            }
        }

        return result;
    }



}
