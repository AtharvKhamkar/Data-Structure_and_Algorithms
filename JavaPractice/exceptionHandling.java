public class exceptionHandling {
    public static void main(String[] args) {
//        try{
//            try{
//                String name = null;
//                System.out.println(name.length());
//            }catch (NullPointerException e){
//                System.out.println(e.toString());
//            }
//            System.out.println("after null exception");
//            int num1 = 10;
//            int num2 = 0;
//            int total = num1/num2;
//        }catch (ArithmeticException e){
//            System.out.println(e.toString());
//        };
//        System.out.println("After zero exception");
//    }

        try{
            int num1 = 10;
            int num2 = 0;
            int total = num1 / num2;

        }catch (ArithmeticException e){
            System.out.println("Dividing by zero");
        }catch(Exception e){
            System.out.println(" zero");
        }
        System.out.println("Hello");

    }
}
