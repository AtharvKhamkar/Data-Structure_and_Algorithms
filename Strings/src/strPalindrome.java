public class strPalindrome {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            int end = s.length()-i-1;
            if(s.charAt(i) != s.charAt(end)){
                s = s.substring(0,i) + s.substring(i+1);
                return paindrome(s);
            }
        }
        return true;
    }

    public static boolean paindrome(String s){
        for (int i = 0; i < s.length(); i++) {
            int end = s.length()-i-1;
            if(s.charAt(i) != s.charAt(end)){
                return false;
            }
        }
        return true;

    }
}
