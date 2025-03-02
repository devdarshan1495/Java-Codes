
import java.io.*;

public class FileInputStreamEx3 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("ABC.txt"); // relative path
            int b;
            while ((b = fin.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("IO Error");
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}