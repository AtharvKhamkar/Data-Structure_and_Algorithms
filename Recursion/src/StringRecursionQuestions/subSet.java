package StringRecursionQuestions;
import java.util.*;

public class subSet {
    public static void main(String[] args){
        String pro = " ";
        String unpro = "abc";
        System.out.println(subsetsReturn(pro,unpro));

    }

    public static void subsets(String pro,String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char Ch = unpro.charAt(0);

        subsets(pro + Ch,unpro.substring(1));
        subsets(pro,unpro.substring(1));
    }

    public static ArrayList<String> subsetsReturn(String pro,String unpro){
        if(unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        char Ch = unpro.charAt(0);
        ArrayList<String> left = subsetsReturn(pro+Ch,unpro.substring(1));
        ArrayList<String> right = subsetsReturn(pro,unpro.substring(1));

        left.addAll(right);
        return left;
    }
}
