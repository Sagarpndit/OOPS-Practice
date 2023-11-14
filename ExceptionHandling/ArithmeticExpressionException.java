//Arithmetic Expression handling
public class ArithmeticExpressionException {
    public static void main(String[] args) {
        System.out.println("Method Started");
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error hai " + e);
        }

        System.out.println("Method ended");

    }
}
