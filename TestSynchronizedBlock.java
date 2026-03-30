
class Table{

    void printTable(int n){
    System.out.println("this is my table");
    synchronized(this){
            for(int i =1; i<=10 ;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(4000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
    }
}
}


class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
}
    public void run(){
        System.out.println("table of 5");
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
}
    public void run(){
        System.out.println("table of 10");
        t.printTable(10);
    }
}

public class TestSynchronizedBlock {
    public static void main(String[] args) {
        Table t = new Table();

        MyThread1 m1 = new MyThread1(t);
        MyThread2 m2 = new MyThread2(t);

        m1.start();
        m2.start();
    }
}
