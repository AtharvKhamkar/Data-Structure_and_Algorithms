import java.lang.Math;
public class fiboSeries {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fiboFormula(i));
        }
    }

    public static int fiboFormula(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
