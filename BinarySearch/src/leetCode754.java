//https://leetcode.com/problems/reach-a-number/
//You are standing at position 0 on an infinite number line. There is a destination at position target.
//
//You can make some number of moves numMoves so that:
//
//On each move, you can either go left or right.
//During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
//Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

public class leetCode754 {
    public static void main(String[] args) {
        int finalCount = countMoves(6);
        System.out.println(finalCount);
    }

    public static int countMoves(int target){
        int ans = 0;
        int count = 0;
        int start = 0;

            for (int j = 1; j < target;) {
                start = start + j;
                count++;
                j++;
            }

        return count;
    }


}
