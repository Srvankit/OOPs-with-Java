import java.util.*;

public class firstclass {
    public static void main(String[] args){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("enter your number: ");
            int a = Sc.nextInt();
             if (a%15==0) {
            System.out.println("Zoom");
      }
      else if (a%3==0) {
            System.out.println("Zip");
      }
      else if (a%5==0) {
            System.out.println("Zap");
      }
      else{
            System.out.println("invalid");
      }
        }
    }
}
