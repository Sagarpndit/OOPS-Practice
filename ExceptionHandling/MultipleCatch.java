public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 20, b = 0;
            System.out.println(a / b);
            String str = "sagar";
            System.out.println(str.toUpperCase());

            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Method ended");
        }
    }
}
