import java.util.*;
import java.lang.*;
public class findDistance {
    public static void main(String[] args){
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 4;
        int x3 = 3;
        int y3 = 6;
        System.out.println("Distance Between x1 and x2");
        System.out.println(findDist(1,2,1,4));
        System.out.println("Distance Between x1 and x3");
        System.out.println(findDist(1,3,1,6));
        System.out.println("Distance Between x2 and x3");
        System.out.println(findDist(2,3,4,6));
    }

    public static int findDist(int a1,int a2,int b1,int b2){
        return (int)Math.sqrt(Math.pow(Math.abs(a1-a2),2) + Math.pow(Math.abs(b1-b2),2));
    }
}
