import java.io.FileWriter;

public class FileWriterEx1 {
    public static void main(String args[]) {
        String data = "This is the data in the output file";
        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("Output.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
