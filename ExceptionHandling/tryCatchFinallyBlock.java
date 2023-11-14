public class tryCatchFinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.print("Statement 1 \n");
            int a = 20, b = 0;
            System.out.println(a / b);
            System.out.println("Statement 3");
        } catch (Exception e) {
            System.out.println("Statement 4");
        } finally {
            System.out.println("Statement 5");
        }
        System.out.println("Statement 6");
    }
}
