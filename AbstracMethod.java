/*
abstract class programming {
    public abstract void Developer();

    public abstract void Rank();
}

class HTML extends programming {
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }

    @Override
    public void Rank() {
        System.out.println("3rd");
    }
}

abstract class JAVA extends programming {
    @Override
    public void Developer() {
        System.out.println("James Gosling");
    }
}

public class AbstracMethod {
    public static void main(String[] args) {
        programming h = new HTML();
        // programming j = new JAVA();
        h.Developer();
    }
}
*/
abstract class programming {
    public abstract void Developer();

    public abstract void Rank();
}

abstract class HTML extends programming {
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }

}

class JAVA extends HTML {
    @Override

    public void Rank() {
        System.out.println("2nd");
    }
}

public class AbstracMethod {
    public static void main(String[] args) {
        programming h = new JAVA();
        h.Developer();
        h.Rank();
    }
}