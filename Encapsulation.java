class A {
    private int value; // data hiding
    // data adbstraction

    public void setValue(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(25);
        System.out.println(r.getValue());
        // System.out.println(r.value); -> error
    }
}
