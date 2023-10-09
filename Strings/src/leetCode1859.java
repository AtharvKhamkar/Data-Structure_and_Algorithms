//https://leetcode.com/problems/sorting-the-sentence/
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

import java.util.Arrays;

public class leetCode1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(Arrays.toString(sortSentence(s)));

    }

    public static String[] sortSentence(String s) {
        String[] strArray = s.split(" ");
        Arrays.stream(strArray).sorted();
        return strArray;


    }

    public static void sortArray(String[] strArray){
        for (int i = 0; i < strArray.length-1; i++) {
            if(strArray[i].charAt(strArray[i].length()-1) > strArray[i+1].charAt(strArray[i+1].length()-1)){
                swap(strArray,i,i+1);
            }

        }
    }

    public static void swap(String[] str,int first,int second){
        String temp = str[first];
        str[first] = str[second];
        str[second] = temp;
    }

}
