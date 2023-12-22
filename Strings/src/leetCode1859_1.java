import java.util.*;
public class leetCode1859_1 {
    public static void main(String[] args){
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));


    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");

        int i=0;
        while(i<str.length){
            char correct = str[i].charAt(str[i].length()-1);
            int newCorrect  = correct - '0'-1;
            if(i != newCorrect){
                swap(str,i,newCorrect);
            }else{
                i++;
            }
        }

        String[] ans = new String[str.length];

        for(int j=0;j<str.length;j++){
            ans[j] = str[j].substring(0,str[j].length()-1);
        }

        for(int k=0;k<str.length;k++){
            sb.append(ans[k]);
            sb.append(" ");
        }
        return sb.toString().strip();

    }



    public static void swap(String[] str,int index1,int index2){
        String temp = str[index1];
        str[index1] = str[index2];
        str[index2] = temp;
    }
}
