public class compressString {
    public static void main(String[] args) {
        String str = "aaabbbccddde";
        System.out.println(compress(str));

    }

    public static String compress(String str){
        String ans = String.valueOf(str.charAt(0));
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            } else if (i<str.length()-1 && str.charAt(i) != str.charAt(i+1)) {
                ans += count;
                ans += str.charAt(i+1);
                count=1;
            }
            else{
                ans+=count;
            }
        }

        return ans;
    }
}
