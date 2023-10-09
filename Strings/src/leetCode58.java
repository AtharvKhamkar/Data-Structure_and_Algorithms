public class leetCode58 {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        String reversedString = reverseString(s);
        String trimed = reversedString.trim();
        int i = 0;
        int count = 0;
        while(trimed.charAt(i) != ' '){
            count++;
            i++;
            if(i == trimed.length()){
                return count;
            }
        }
        return count;
    }

    public static String reverseString(String s){
        StringBuilder  reverse = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
        return reverse+"";
    }
}
