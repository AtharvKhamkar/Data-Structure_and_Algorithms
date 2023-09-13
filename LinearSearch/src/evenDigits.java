public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(evenOrNot(nums[i])){
                count++;
            }

        }
        return count;
    }


    //for checking numbers of digits are even or not
    static boolean evenOrNot(int num){
        int result = digits(num);
        if(result % 2 == 0){
            return true;
        }
        return false;

    }

    //for checking number of digits in a particular number
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
