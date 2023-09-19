//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

public class leetCode744 {

    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;



        while (start <= end) {

            //find the middle element
            int mid = start + (end - start) / 2;   //similar to mid = (start + end)/2

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // element not found
        return letters[start % letters.length];


    }
}
