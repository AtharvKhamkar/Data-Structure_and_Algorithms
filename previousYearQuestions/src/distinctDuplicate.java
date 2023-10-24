import java.util.*;
public class distinctDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        System.out.println("Enter the value of d");
        int d = sc.nextInt();

        int result = AddDistinctDuplicate(a,b,c,d);
        System.out.println(result);




    }

    public static int AddDistinctDuplicate(int a,int b,int c,int d){
        int[] nums = new int[4];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        nums[3] = d;
        int sum = 0;
        int similar = 0;

        for(int i=0;i<nums.length;){
            if(i < nums.length-2 && nums[i] == nums[i+1]){
                similar = nums[i];
                i = i + 2;
            }else{
                sum = sum + nums[i];
                i++;
            }
        }
        return sum - similar;
    }
}
