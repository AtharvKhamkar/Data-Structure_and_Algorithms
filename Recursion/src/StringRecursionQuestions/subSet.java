package StringRecursionQuestions;
import java.util.*;

public class subSet {
    public static void main(String[] args){
        String pro = " ";
        String unpro = "abc";
        System.out.println(subsetAsciiReturn(pro,unpro));

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

    //Function to return subset in a ArrayList
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

    //Function to Ascii values of subset with subset

    public static void subsetAscii(String pro,String unPro){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char Ch = unPro.charAt(0);
        subsetAscii(pro+Ch,unPro.substring(1));
        subsetAscii(pro,unPro.substring(1));
        subsetAscii(pro+(Ch+0),unPro.substring(1));
    }
    //Function to Ascii values of subset with subset using return
    public static ArrayList<String> subsetAsciiReturn(String pro,String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        char Ch = unPro.charAt(0);
        ArrayList<String> first = subsetAsciiReturn(pro+Ch,unPro.substring(1));
        ArrayList<String> second = subsetAsciiReturn(pro,unPro.substring(1));
        ArrayList<String> third = subsetAsciiReturn(pro + (Ch+0),unPro.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
