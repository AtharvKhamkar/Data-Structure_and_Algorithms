public class sumofdigits {
    public static void main(String[] args){
        int[] arr = {16,18,20};
        System.out.println(differenceSumOfDigits(arr,arr.length));

    }
    public static int differenceSumOfDigits(int[] arr, int n){
        int numbersSum = 0;
        for(int i:arr){
            numbersSum += i;
        }

        int f2 = numbersSum % 10;
        int f1 = digitSum(arr);

        return f1 - f2;
    }

    public static int digitSum(int[] arr){
        int digitSum = 0;
        for(int j=0;j<arr.length;j++){
            int number = arr[j];
            int digit = 0;
            while(number > 0){
                digit = number % 10;
                digitSum += digit;
                number = number / 10;
            }
        }

        return digitSum % 10;
    }
}
