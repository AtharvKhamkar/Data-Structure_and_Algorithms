public class sumofDigits {
    public static void main(String[] args) {
        System.out.println("Sum of the digits using normal method");
        System.out.println(digitSum(1342));
        System.out.println("sum of the digits using recursion method");
        System.out.println(recSum(1342));
        System.out.println("product of the digits using simple method");
        System.out.println(digitProduct(1342));
        System.out.println("product of the digits using recursion method");
        System.out.println(recProduct(1342));

    }


    //sum of the digits using simple method
    public static int digitSum(int n){
        int rem = 0;
        int sum = 0;
        for (int i = n; i > 0;) {
            rem = i % 10;
            sum += rem;
            i = i / 10;
        }

        return sum;
    }

    //product of the digits in simple method
    public static int digitProduct(int n){
        int rem = 0;
        int product = 1;
        for (int i = n; i > 0;) {
            rem = i % 10;
             product = product *  rem;
            i = i / 10;
        }

        return product;
    }

    //sum of the digits using recursion

    public static int recSum(int n){
        if(n == 0){
            return 0;
        }
        return recSum(n / 10) + (n % 10);
    }

    //product of the digits using recursion
    public static int recProduct(int n){
        if(n % 10 == n){
            return n;
        }
        return recProduct(n / 10) * (n % 10);
    }
}
