import java.io.*;
public class FileInputOutputEx1 {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("/Users/devdarshansaravanan/Desktop/Programming/Java/Screenshot 2025-02-17 at 2.54.44 PM.png");
        FileOutputStream fout = new FileOutputStream("/Users/devdarshansaravanan/Desktop/Programming/Java/Screenshot 2025-02-21 at 1.34.01 PM.png")){
            int b;
            while((b=fin.read())!=-1){
                fout.write(b);
            }
        }
        catch(IOException e){
            System.out.println("ERROR in file handling");
        }
    }
}