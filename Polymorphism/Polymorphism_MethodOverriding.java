class shape {
    void draw() {
        System.out.println("Can't Say Shape Type");
    }
}

class square extends shape {
    @Override // this indicate overriding
    void draw() {
        super.draw(); // calls overriding method of super class
        System.out.println("Square Shape");
    }
}

public class Polymorphism_MethodOverriding {
    public static void main(String[] args) {
        shape r = new square();
        r.draw();
    }
}
