public class leetCode125 {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String s) {
        String loweString = s.toLowerCase();
        String str = validString(loweString);

        for (int i = 0; i < str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }

        }
        return true;
    }
//To make continues valid string
    public static String validString(String s){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(isValid(s.charAt(i))){
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
//to check each character in the  string are valid or not
    public static boolean isValid(char ch){
        if((ch>='a' && ch<='z')||(ch>='0'&&ch<='9')){
            return true;
        }
        return false;
    }
}
