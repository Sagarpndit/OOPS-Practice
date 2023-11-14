import java.io.File;

public class displayFileInformation {
    public static void main(String[] args) {
        File f = new File(
                "C:\\Users\\skp10\\OneDrive\\Documents\\GitHub\\JavaCoding\\OOPS Practice\\FileHandling\\Data\\SomeText.txt");

        if (f.exists()) {
            System.out.println("File Name : " + f.getName());
            System.out.println("File Loaction : " + f.getAbsolutePath());
            System.out.println("File Writable : " + f.canWrite());
            System.out.println("File Readable : " + f.canRead());
            System.out.println("File Size : " + f.length());
            System.out.println("File Removed : " + f.delete());

        } else {
            System.out.println("File Doesn't Exists");
        }
    }
}
