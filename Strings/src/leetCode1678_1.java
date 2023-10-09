public class leetCode1678_1 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));

    }

    public static String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans += "o";
                i+=1;
            } else if (command.charAt(i) == 'G') {
                ans+="G";
            }
            else{
                ans += "al";
                i+=3;
            }
        }
        return ans;
    }
}
