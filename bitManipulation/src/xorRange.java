public class xorRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = xor(9) ^ xor(a -1);
        System.out.println(ans);

        //another approach...but this will give of bound time error for large numbers in questions
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);

    }

    public static int xor(int n){
        if(n % 4 == 0){
            return n;
        }
        if(n % 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return n + 1;
        }
        return 0;
    }
}
