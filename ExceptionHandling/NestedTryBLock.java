public class NestedTryBLock {
    public static void main(String[] args) {
        try {
            System.out.println("Error A1");
            try {
                System.out.println("Error B1");
            } catch (Exception e) {
                System.out.println("Handling B1");
            }
        } catch (Exception e) {
            System.out.println("Handling A1");
        }
    }
}
