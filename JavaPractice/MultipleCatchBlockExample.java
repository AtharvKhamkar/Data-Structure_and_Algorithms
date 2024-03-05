public class MultipleCatchBlockExample {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;

            // This line might throw either ArithmeticException or NullPointerException
            int result = num1 / num2; // Potential ArithmeticException
            String name = null;
            System.out.println(name.length()); // Potential NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access length of null object!");
        } finally {
            System.out.println("This will always be executed.");
        }
    }
}
