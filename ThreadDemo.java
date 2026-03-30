public class ThreadDemo extends Thread {

    public void run(){
        System.out.println("this is my run method");
        System.out.println("thread names....."+Thread.currentThread().getName());
        System.out.println("is Alive....."+Thread.currentThread().isAlive());
        System.out.println("Class....."+Thread.currentThread().getClass());
        System.out.println("Daemon....."+Thread.currentThread().isDaemon());
        System.out.println("Priority......."+Thread.currentThread().getPriority());
        System.out.println("IDs......."+Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        ThreadDemo td1 = new ThreadDemo();
        ThreadDemo td2 = new ThreadDemo();
        ThreadDemo td3 = new ThreadDemo();
        
        td1.setName("Ankit");
        td2.setName("yadav");
        td3.setName("ayush");

        td1.setPriority(MAX_PRIORITY);
        td2.setPriority(MIN_PRIORITY);
        td3.setPriority(NORM_PRIORITY);

        td1.start(); // start() is used to create a new thread;
        td2.start(); // start will automatically load run
        td3.start();
    }
}
