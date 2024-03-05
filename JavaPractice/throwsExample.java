public class throwsExample {
    public static void main(String[] args){
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Hello world");

    }


    public static void divide() throws Exception{
        int a = 10;
        int b = 0;

        int total = a / b;
    }
}
