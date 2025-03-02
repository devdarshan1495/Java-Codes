import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("OutFile1.txt")) {
            String s = "Welcome to java learners";
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("Written in file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exc");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
