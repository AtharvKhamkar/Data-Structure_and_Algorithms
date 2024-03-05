public class custom{
    public static void main(String[] args) {
        try{
            int num1 = 10;
            if(num1 == 10){
                throw new customException("Number is equal to 10");
            }

        }catch (customException e){
            System.out.println(e.toString());
        }

    }

}