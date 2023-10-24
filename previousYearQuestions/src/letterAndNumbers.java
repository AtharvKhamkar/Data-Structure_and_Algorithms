import java.util.*;
public class letterAndNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in Capital letters");
        String str = sc.next();
        char[] charArray = new char[str.length()];
        for(int j=0;j<charArray.length;j++){
            charArray[j] = str.charAt(j);
        }
        int len = charArray.length;

        int result =  letturedNumberSum(charArray,len);
        System.out.println(result);


    }

    public static int letturedNumberSum(char[] str,int len){
        int sum = 0;
        for(int i=0;i<str.length;i++){
            char ch = str[i];


            switch (ch){
                case 'A':
                    sum = sum + 1;
                    break;
                case 'B':
                    sum += 10;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 1000;
                    break;
                case 'E':
                    sum += 10000;
                    break;
                case 'F':
                    sum += 100000;
                    break;
                case 'G':
                    sum += 1000000;
                    break;
                default:
                    sum += 0;
            }
        }
        return sum;
    }
}
