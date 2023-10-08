public class suubString {
    public static void main(String[] args) {
        subString("abcd");

    }

    public static void subString(String str){
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j));
                System.out.print(" ");
            }
        }
    }
}
