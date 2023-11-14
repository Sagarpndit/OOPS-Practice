import java.io.*;

public class CopyFileData {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream(
                "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\someText.txt");
        FileOutputStream w = new FileOutputStream(
                "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\SomeText.txt");

        int i;
        while ((i = f.read()) != -1) {
            w.write((char) i);
        }
        System.out.println("Data Copied Succesfully");
        f.close();
        w.close();
    }
}
