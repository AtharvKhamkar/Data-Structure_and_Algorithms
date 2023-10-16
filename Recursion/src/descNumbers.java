public class descNumbers {
    public static void main(String[] args) {
        printBoth(5);

    }

    public static int descNums(int n){
        System.out.print(n+" ");
        if(n == 1){
            return 1;
        }
        return descNums(n-1);
    }

    public static void deNumbers(int n){
        System.out.print(n + " ");
        if(n == 1){
            return;
        }
        deNumbers(n-1);
    }

    //function to print both ascending and descending order of a number
    public static void printBoth(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        printBoth(n-1);
        System.out.print(n + " ");
    }

}
