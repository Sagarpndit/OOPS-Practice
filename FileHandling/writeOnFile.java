import java.io.FileWriter;
import java.io.IOException;

public class writeOnFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter(
                    "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\SomeText.txt");
            try {
                f.write("Hello from VS COde");
            } finally {
                f.close();
            }
            System.out.println("Succesfully wrote in File");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

// BufferedWriter
// FileOutputStream
// PrintWriter