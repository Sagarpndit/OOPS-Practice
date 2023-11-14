import java.util.Scanner;

interface client {

    void input(); // public + abstract

    void output(); // public + abstract
}

class Raju implements client {
    String name;
    double salary;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter User Name");
        name = r.nextLine(); // nextline is used to store

        System.out.println("Enter Salary: ");
        salary = r.nextDouble();
        r.close();
    }

    public void output() {
        System.out.println(name + salary);
    }

}

public class InterfaceIntro {
    public static void main(String[] args) {
        client c = new Raju();
        c.input();
        c.output();
    }
}
