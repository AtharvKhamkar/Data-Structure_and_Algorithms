package StringRecursionQuestions;

public class String2 {
    public static void main(String[] args){
        String str = "bcdapplegg";
        System.out.println(skipString(str));

    }

    public static String skipString(String str){
        if(str.isEmpty()){
            return " ";
        }

        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }else{
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
