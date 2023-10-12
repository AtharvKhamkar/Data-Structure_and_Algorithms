public class leetCode1976 {
    public static void main(String[] args) {
        String[] patters = {"a","a","a"};
        String word = "ab";
        System.out.println(numOfStrings(patters,word));

    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i])){
                count++;
            }else{
                continue;
            }

        }
        return count;

    }
}
