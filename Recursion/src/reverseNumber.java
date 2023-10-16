public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(rev(4321));
        System.out.println(palindrome(4321));


    }



    //reverse a number using simple iterative method
    public static int reverseNum(int n){
        int count = 0;
        int finalAns = 0;
        int originalNumber = n;
        for (int i = n; i > 0 ;) {
            i = i / 10;
            count++;
        }
        count = count -1;
        int rem = 0;
        for (int j = originalNumber; j > 0;) {
            rem = j % 10;
            finalAns += (int) (rem * Math.pow(10,count));
            count--;
            j = j / 10;


        }
        return finalAns;
    }

    //reverse a number using recursion way 1
    static int sum = 0;
    public static void reverseNum1(int n){
        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNum1(n / 10);
    }

    //reverse a number using recursion way 2
    public static int rev(int n){
        //sometimes you need additional variables in the argument to get this variables simple make another function.
        int digits = (int)Math.log10(n) + 1;
        return helper(n,digits);

    }

    private static int helper(int n, int digits) {

        if(n % 10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }

    public static boolean palindrome(int n ){
        return (n == rev(n));
    }
}
