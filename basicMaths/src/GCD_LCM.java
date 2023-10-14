public class GCD_LCM {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        System.out.println(GCD(a,b));
        System.out.println(LCm(a,b));


    }

    public static int GCD(int a,int b){
        if(a == 0){
            return b;
        }
        return GCD(b%a,a);
    }

    public static int LCm(int a,int b){
        return (a * b)/GCD(a,b);
    }


}
