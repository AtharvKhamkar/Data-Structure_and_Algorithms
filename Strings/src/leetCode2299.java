public class leetCode2299 {
    public static void main(String[] args) {
        String password = "11A!A!Aa";
        System.out.println(strongPasswordCheckerII(password));


    }

    public static boolean strongPasswordCheckerII(String password) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.length() >= 8) {
                flag1 = true;
            }
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                flag2 = true;
            }
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                flag3 = true;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                flag4 = true;
            }
            if (i < password.length() - 2 &&  password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
            else{
                flag6 = true;
            }
        }
        if (flag1 && flag2 && flag3 && flag4 && flag6) {
            return true;
        }
        return false;

    }
}
