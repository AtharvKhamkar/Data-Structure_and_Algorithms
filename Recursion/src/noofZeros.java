public class noofZeros {
    public static void main(String[] args) {
        System.out.println(zeroesRecursion(202020));

    }

    //counting no of zeroes using iterative method
    public static int numberofZeroes(int n){

        int count = 0;
        for (int i = n; i > 0 ;) {
            if(i % 10 == 0){
                count++;
            }
            i = i / 10;
        }
        return count;
    }

    //counting no of zeroes using recursion method
    public static int zeroesRecursion(int n){
        int c = 0;
        return Helper(n,c);

    }

    public static int Helper(int n,int c){
        if(n % 10 == n){
            return c;
        }

        if(n % 10 == 0){
            return Helper(n/10,c+1);
        }
        return Helper(n/10,c);

    }
}
