public class leetCode1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        for (int i = Math.min(length1,length2); i >= 1 ; --i) {
            if (isValid(str1,str2,i)){
                return str1.substring(0,i);
            }

        }
        return "";

    }
    public static boolean isValid(String str1,String str2,int k){
        int len1 = str1.length();
        int len2 = str2.length();

        if(len1%k > 0 || len2%k > 0){
            return false;
        }else{
            String base = str1.substring(0,k);
            return str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty();
        }
    }
}
