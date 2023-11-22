public class trianglePattern2 {
    public static void main(String[] args){
        pattern2(4,0);

    }

    public static void pattern2(int r,int c){
        if(r == 0){
            return;
        }

        if(r > c){

            pattern2(r,c+1);
            System.out.print("*");
        }else{

            pattern2(r-1,0);
            System.out.println();
        }
    }
}
