import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader(
                    "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\SomeText.txt");
            try {
                int i; // read -> read char by char
                while ((i = r.read()) != -1) {
                    System.out.println((char) i);
                }
            } finally {
                r.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

//BufferedReader
//Scanner Class
//FileInputStream