public class factorial {
    public static void main(String[] args) {
        System.out.println(sum(5));

    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }

        return n * factorial(n -1);
    }

    // function to sum n numbers

    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
