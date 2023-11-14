import java.io.*;

public class renameAFile {
    public static void main(String[] args) {
        File f = new File(
                "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\SomeText.txt");
        File r = new File(
                "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\someText.txt");
        if (f.exists()) {
            System.out.println(f.renameTo(r));
        } else {
            System.out.println("File Doesn't Exist");
        }
    }
}
