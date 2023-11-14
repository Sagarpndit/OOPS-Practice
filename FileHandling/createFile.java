import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {

        File f = new File(
                "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\SomeText.txt");
        // -> either use throws or use try catch
        // if (f.createNewFile()) {
        // System.out.println("File Succesfully Created");
        // } else {
        // System.out.println("File Already Created");
        // }

        try {
            if (f.createNewFile()) {
                System.out.println("File Succesfully Created");
            } else {
                System.out.println("File Already Created");
            }
        } catch (IOException e) {
            System.out.println("Exception Handled");
        }

    }
}