//https://leetcode.com/problems/shuffle-string/description/
//You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//
//Return the shuffled string.
import java.util.*;
public class leetCode1528 {
    public static void main(String[] args) {
        String s = "a";
        int[] indices = {0};
        System.out.println(restoreString(s, indices));

    }

    public static String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for (int i = 0; i <indices.length; i++) {
            ch[indices[i]] = s.charAt(i);

        }
        String ans = new String(ch);
        return ans;

    }
}
