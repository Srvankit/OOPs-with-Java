public class ExampleThread implements Runnable{

    public void run(){
        System.out.println("This is my run method");
        
    }
    public static void main(String[] args) {
        ExampleThread et = new ExampleThread();

        Thread t = new Thread(et);
        t.start();
    }
}
