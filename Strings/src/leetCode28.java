public class leetCode28 {
    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));

    }


    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length() - needle.length()+1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
