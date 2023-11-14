//class
class Demo {
    int a = 10;
    String b = "Sagar";

    // method
    void show() {
        System.out.println(a + " " + b);
    }
}

class Test {
    // main function
    public static void main(String[] arg) {
        // Object creation
        Demo r = new Demo();
        r.show();
    }

}