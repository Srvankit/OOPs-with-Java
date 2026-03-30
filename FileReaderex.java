
import java.io.FileReader;

public class FileReaderex {
public static void main(String[] args) {
        char[] c = new char[100];
        try {
            FileReader input = new FileReader("C:\\Users\\AnkitAccess\\Downloads\\java class (4th sem)\\test4.txt");
            input.read(c);
            System.out.println(c);
            System.out.println(c);
            input.close();
        } catch (Exception e) { 
            // TODO: handle exception
        }
    }
    
}
    




