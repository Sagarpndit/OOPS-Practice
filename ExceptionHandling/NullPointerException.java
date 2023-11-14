public class NullPointerException {
    public static void main(String[] args) {
        System.out.println("Method Started");
        // String str = null;
        try {
            // System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("Null can't be casted");
        }
        System.out.println("Method Ended");
    }
}
