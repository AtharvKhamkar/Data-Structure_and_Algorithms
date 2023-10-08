public class reverseString {
    public static void main(String[] args) {
        String str = "I am an online educator";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder("");
        String ans="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans+=" ";
                sb = new StringBuilder("");
            }
        }
        sb.append(" ");
        sb.reverse();
        ans += sb;
        return ans;

    }



}
