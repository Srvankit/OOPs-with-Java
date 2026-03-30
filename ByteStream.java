import java.io.*;

public class ByteStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\AnkitAccess\\Downloads\\java class (4th sem)//test4.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\AnkitAccess\\Downloads\\java class (4th sem)//test5.txt");
        
        int i;
        while ((i=fin.read()) !=-1) {
            fout.write(i);
        }
        fin.close();
        fout.close();
        System.out.println("file copied successfully using ByteStream");
    }
}