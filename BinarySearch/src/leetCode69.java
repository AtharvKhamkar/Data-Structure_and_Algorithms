//https://leetcode.com/problems/sqrtx/description/
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

public class leetCode69 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));

    }

    public static int mySqrt(int x) {
        if(x == 0){
            return 0;
        }

        int start = 0;
        int end = x;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid == x / mid){
                return mid;
            }else if(mid < x/mid){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}
