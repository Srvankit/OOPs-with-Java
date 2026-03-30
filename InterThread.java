class Test{
  synchronized void waitMethod(){
    try{
        System.out.println("thread is waiting ");
        wait();
        System.out.println("thread is resumed");
    }
    catch(Exception e){
        System.out.println("exception occur");
    }
  }
  synchronized void notifyMethod(){
    System.out.println("notify method ");
  }
}

class MyTh1 extends Thread{
    Test t;
    MyTh1(Test t){
        this.t=t;
    }
    public void run(){
        t.waitMethod();
    }
}
class MyTh2 extends Thread{
    Test t;
    MyTh2(Test t){
        this.t=t;
    }
    public void run(){
        t.notifyMethod();
    }
}

public class InterThread {

    public static void main(String[] args) {
        Test t = new Test();

        MyTh1 t1 = new MyTh1(t);
        MyTh2 t2 = new MyTh2(t);

        t1.start();
        t2.start();

    }
}