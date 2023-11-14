/* 
1.) This keyword refers to current object inside a method or constructor
public class thisKeyword {
    void show() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        thisKeyword r = new thisKeyword();
        System.out.println(r);
        r.show();

        // Output
        // thisKeyword@4517d9a3
        // thisKeyword@4517d9a3
    }
}
2.) Differentitate between instance and local variable of same variable name in class.
public class thisKeyword {
    int a; // instance variable

    thisKeyword(int a) { // local variable
        this.a = a;
    }

    void show() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        thisKeyword r = new thisKeyword(20);
        r.show(); // -> 20
    }
}

// 3.) It is also used when we want to call the default constructor of its own class

public class thisKeyword {
    thisKeyword() {
        System.out.println("Hello from Default Constructor");
    }

    thisKeyword(int a) {
        this(); // - > this will call default constructor
        System.out.println("Hello from Parameterized constructor");
    }

    public static void main(String[] args) {
        thisKeyword r = new thisKeyword(10);

        // Output
        // Hello from Default Constructor
        // Hello from Parameterized constructor
    }
}
*/

// 4.) It is also used when we want to call the parameterized constructor of its own class
public class thisKeyword {
    thisKeyword() {
        this(10); // - > this will call default constructor
        System.out.println("Hello from Default Constructor");
    }

    thisKeyword(int a) {

        System.out.println("Hello from Parameterized constructor");
    }

    public static void main(String[] args) {
        thisKeyword r = new thisKeyword();
        System.out.println(r);
        // Output
        // Hello from Parameterized constructor
        // Hello from Default Constructor

    }
}