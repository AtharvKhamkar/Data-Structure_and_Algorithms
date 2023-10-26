public class leetCode202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int n) {
        int sum = n;

        while(sum != 1){
            int rem = n % 10;
            sum += (int)Math.pow(rem,2);
            int div = n / 10;
            sum += (int)Math.pow(div,2);
        }
        return true;
    }
}
