//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//Given an integer num, return the number of steps to reduce it to zero.
//
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class leetCode1342 {
    public static void main(String[] args) {

    }
    public static int numberOfSteps(int num) {
        return Helper(num,0);

    }

    public static int Helper(int num,int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return Helper(num/2,steps+1);
        }
        return Helper(num-1,steps+1);
    }
}
