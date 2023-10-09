//https://leetcode.com/problems/goal-parser-interpretation/description/
//You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
//
//Given the string command, return the Goal Parser's interpretation of command.

public class leetCode1678 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));

    }

    public static String interpret(String command) {
        String ans = command.replace("()","o");
        String final_ans = ans.replace("(al)","al");
        return final_ans;

    }
}
