public class powerMultiplication {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int ans = 1;
        int base = 3;

        while(b > 0){
            if( (b & 1)== 1){
                ans *= base;
            }
            base *= base;
            b = b >> 1;
        }
        System.out.println(ans);
    }
}
