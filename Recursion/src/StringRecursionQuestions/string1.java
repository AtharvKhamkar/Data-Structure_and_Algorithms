package StringRecursionQuestions;

public class string1 {
    public static void main(String[] args){
        String str = "baccad";
        System.out.println(skip(str));

    }

    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char Ch = str.charAt(0);

        if(Ch == 'a'){
            return skip(str.substring(1));
        }else{
            return Ch + skip(str.substring(1));
        }
    }
}
