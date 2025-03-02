
//file input stream example
import java.io.*;
public class FileInputStreamEx
{
    public static void main(String[] args) {
        FileInputStream fin=null;
        try{
            fin=new FileInputStream("ABC.txt");
            int b;
            while((b=fin.read())!=-1){
                System.out.print((char)b);
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found exception" +e);
        }
        catch(IOException e)
        {
            System.out.println("IO error" +e);
        }
        finally{
            try{
                if(fin!=null)
                fin.close();
            }catch(IOException e){
                System.out.println("Error closing file");
            }
        }
    }
}