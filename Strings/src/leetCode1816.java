import java.util.Arrays;

public class leetCode1816 {
    public static void main(String[] args) {
        String s =  "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));

    }

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(count == k){
                break;
            }
            if(s.charAt(i) == ' '){
                count++;
            }
            sb.append(s.charAt(i));
        }

        if(sb.charAt(sb.length()-1) == ' '){
            sb.deleteCharAt(sb.length()-1);
        }



        return sb.toString();


    }
}
