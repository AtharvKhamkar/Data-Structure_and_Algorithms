public class leetCode709 {
    public static void main(String[] args) {
        String s = "here";
        System.out.println(toLowerCase(s));


    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int asciNumber = s.charAt(i);
            if(asciNumber >= 65 && asciNumber <= 90){
                asciNumber = asciNumber + 32;
                sb.append((char)asciNumber);
            }else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
