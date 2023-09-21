public class leetCode367 {
    public static void main(String[] args) {
        int num = 1225;
        System.out.println(isPerfectSquare(num));

    }

    public static boolean isPerfectSquare(int num) {
        if(num == 0){
            return true;
        }
        if(num == 1){
            return true;
        }

        int start = 1;
        int end = num;

        while(start <= end){

            long mid = start + (end - start)/2;

            if(mid*mid == num){
                return true;
            } else if (mid < num/mid) {
                start = (int)mid + 1;
            }
            else{
                end = (int)mid -1;
            }
        }
        return false;
    }
}
