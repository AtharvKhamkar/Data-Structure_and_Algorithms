//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
//You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
//
//Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
//
//Return true if a and b are alike. Otherwise, return false.
public class leetCode1704 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));

    }

    public static boolean halvesAreAlike(String s) {
        String newString = s.toLowerCase();
        int sub1 = 0;
        int sub2 =0;

        for (int i = 0; i < newString.length()/2; i++) {
            if(newString.charAt(i) == 'a'||newString.charAt(i) == 'e'||newString.charAt(i) == 'i'||newString.charAt(i) == 'o'||newString.charAt(i) == 'u'){
                sub1++;
            }else{
                continue;
            }
        }

        for (int i = (newString.length()/2); i < newString.length(); i++) {
            if(newString.charAt(i) == 'a' ||newString.charAt(i) == 'e' ||newString.charAt(i) == 'i' ||newString.charAt(i) == 'o' ||newString.charAt(i) == 'u'){
                sub2++;
            }else{
                continue;
            }
        }
        if(sub1 == sub2){
            return true;
        }else{
            return false;
        }
    }
}
