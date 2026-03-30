import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\AnkitAccess\\Downloads\\java class (4th sem)\\test4.txt");  

            if (file.createNewFile()) {
                System.out.println("file is created");
            }else{
                if (file.exists()) {
                    System.out.println("filr already exists");
                }
            }
            
        // boolean b = file.delete();
        // if (b==true) {
        //     System.out.println("file deleted");
        // }
        // else{
        //     System.out.println("file not deleted");
        // }

        
        }


        catch(IOException e){
            System.out.println("exception occurs "+e);
        }
    }
}
