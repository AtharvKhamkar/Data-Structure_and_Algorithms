public class binarySearchSQRT {

    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f",findSQRT(n,p));

    }

    public static double findSQRT(int n ,int p){

        int s = 0;
        int e = n;
        double root = 0.0;

        while(s<=e){
            int m = s + (e-s)/2;

            if(m * m == n){
                return m;
            }
            else if(m * m > n){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        double incrm = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += incrm;
            }
            root-=incrm;
            incrm /= 10;
        }
        return root;

    }
}
