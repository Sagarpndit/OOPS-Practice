public class MultipleTryCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by zero");
        }

        try {
            int a[] = { 1, 2, 3, 4, 5 };
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Beyond the array Limit");
        }
    }
}
