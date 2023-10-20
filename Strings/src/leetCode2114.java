import java.util.ArrayList;
import java.util.Arrays;

public class leetCode2114 {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));

    }

    public static int mostWordsFound(String[] sentences) {
            int count = 0;
            int[] answer = new int[sentences.length];
            for (int i = 0; i < sentences.length; i++) {
                for (int j = 0; j < sentences[i].length(); j++) {
                    if(sentences[i].charAt(j) == ' '){
                        count++;
                    }
                }
                answer[i] = count + 1;
                count = 0;
            }

            int MAX = answer[0];
            for (int i = 0; i < answer.length; i++) {
                if(answer[i] > MAX){
                    MAX = answer[i];
                }
            }
            return MAX;
    }
}
