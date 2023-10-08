import java.sql.SQLOutput;

public class nosPalindrome {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(substring(str));

    }

    public static int substring(String str){
        int counter=0;

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {

                if(countPalindrome(str.substring(i,j))){
                    counter++;
                }
            }

        }
        return counter;
    }

    public static boolean countPalindrome(String substring){
        StringBuilder gtr = new StringBuilder(substring);
        gtr.reverse();
        String s = gtr + "";
        if(substring.equals(s)){
            return true;
        }else{
            return false;
        }
    }
}
