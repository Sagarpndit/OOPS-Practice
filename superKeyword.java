/*
1.) Super keyword in variable 
class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void show() {
        System.out.println(a); // -> 20
        System.out.println(super.a); // ->10
    }
}

class superKeyword {
    public static void main(String[] args) {
        B r = new B();
        r.show(); // ->20
    }
}
*/

/* 
2.) Super keyword in methods
class A {
    void show() {
        System.out.println("Hello viewer");
    }
}

class B extends A {
    void show() {
        super.show(); // -> super keywrod refers to the object of super class
        System.out.println("Hello Learner");
    }
}

class superKeyword {
    public static void main(String[] args) {
        B r = new B();
        r.show(); // ->20

        // outpout
        // -> Hello viewer
        // -> Hello Learner
    }
}
*/
/* 
3.) super keyword  in constructor
class A {
    A() {
        System.out.println("Hello viewer");
    }
}

class B extends A {
    B() {
        //super() -> it will default call when it is not written
        System.out.println("Hello Learner");
    }
}

class superKeyword {
    public static void main(String[] args) {
        B r = new B();
        //output 
        //-> Hello viewer
        //->Hello Learner
    }
}
*/

class A {
    A(int a) {
        System.out.println("Hello viewer" + a);
    }
}

class B extends A {
    B() {
        super(100); // -> it is necessary to call super in case parameterized constructor because
                    // default super call only calls with no parameters.
        System.out.println("Hello Learner");
    }
}

class superKeyword {
    public static void main(String[] args) {
        B r = new B();
        System.out.println(r);
        // output
        // -> Hello viewer
        // ->Hello Learner
    }
}
