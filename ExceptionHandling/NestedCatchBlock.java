public class NestedCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Error A1");

        } catch (Exception e) {
            try {
                System.out.println("Error B1" + e);
            } catch (Exception f) {
                System.out.println("Handling B1" + f);
            }
            System.out.println("Handling A1");
        }
    }
}
