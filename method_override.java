
    class Payment{
        public void pay(int amount){
            System.out.println("this is my generic payment");
        }
    }
    class Upi extends  Payment{
        public void pay(int amount){
            System.out.println("this is my UPI payment "+amount);
        }
    }
    class Cash extends Payment{
        public void pay(int amount){
            System.out.println("this is my cash payment "+amount);
        }
    }
     class Creditcard extends Payment{
        public void pay(int amount){
            System.out.println("this is my credit card payment "+amount);
        }
     }
public class method_override {
    public static void main(String[] args) {
        Payment p= new Upi();
        Payment p1 = new Cash();
        Payment p2 = new Creditcard();
       System.out.println(); 
       p.pay(3000);
       p1.pay(5000);
       p2.pay(500000);
    }
}

