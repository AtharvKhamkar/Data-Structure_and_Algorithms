public class Test{

    public static void main(String[] argv)
    {
        int x,y;
        for(int num =0; num<81;num++)
        {
            if((num % 9)>0)
            {
                x = num/9;
                y = num%9;

            }else
            {
                x = num/9;
                y = 0;
            }

            System.out.println("num ["+num+"]---["+x+","+y+"]");

        }
    }
}