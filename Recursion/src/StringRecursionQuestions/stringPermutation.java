package StringRecursionQuestions;

import java.util.*;


public class stringPermutation {
    public static void main(String[] args){
        String unPro = "abcd";
        String pro = "";
        //permutations(pro,unPro);
        //System.out.println(permutationsReturn(pro,unPro));
        System.out.println(countPermutations(pro,unPro));

    }

    public static void permutations(String pro,String unPro){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char Ch = unPro.charAt(0);

        for (int i = 0; i <= pro.length(); i++) {
            String s = pro.substring(0,i);
            String e = pro.substring(i);
            permutations(s + Ch + e,unPro.substring(1));

        }
    }

    public static ArrayList<String> permutationsReturn(String pro,String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        char Ch = unPro.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= pro.length(); i++) {
            String s = pro.substring(0,i);
            String e = pro.substring(i);
            ans.addAll(permutationsReturn(s+Ch+e,unPro.substring(1)));
        }
        return ans;
    }

    //programme to count number of permutation in a String

    public static int countPermutations(String pro,String unPro){
        if(unPro.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = unPro.charAt(0);

        for (int i = 0; i <= pro.length(); i++) {
            String s = pro.substring(0,i);
            String e = pro.substring(i);
            count = count + countPermutations(s+ch+e,unPro.substring(1));

        }
        return count;
    }
}
