public class leetCode1071_1 {
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "DEF";
        System.out.println(gcdOfStrings(str1,str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);

        for (int i = 0; i <= sb.length(); i++) {
            if(sb.charAt(i) == str2.charAt(i)){
                sb.deleteCharAt(i);
            }

        }
        return sb.toString();

    }
}
