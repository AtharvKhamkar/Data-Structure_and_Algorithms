public class leetCode28 {
    public static void main(String[] args) {
        String haystack = "leetCode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));

    }


    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}
