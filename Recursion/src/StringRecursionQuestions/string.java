package StringRecursionQuestions;

public class string {
    public static void main(String[] args){
        String str = "baccad";
        String ans = "";
        skip(ans,str);
        System.out.println(ans);

    }

    public static void skip(String ans,String input){
        if(input.isEmpty()){
            System.out.println(ans);
            return;
        }

        char Ch = input.charAt(0);

        if(Ch == 'a'){
            skip(ans ,input.substring(1));
        }else{
            skip(ans+Ch,input.substring(1));
        }
    }
}
