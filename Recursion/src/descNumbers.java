public class descNumbers {
    public static void main(String[] args) {
        descConcept(5);
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

    //concept

    public static void descConcept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        //descConcept(n--);     This will give stackoverflow error bcz it first pass the value of n and then substract

        descConcept(--n);       //This first substract the value of n and then pass the function
    }

}
