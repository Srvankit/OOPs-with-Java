import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String data = "this is the data in the output file";
        FileWriter output = new FileWriter("C:\\Users\\AnkitAccess\\Downloads\\java class (4th sem)\\test4.txt");
        
        output.write(data);
        System.out.println("data is written in the file");
        output.close();
    }
}