
public class StaticMethodDemo {
    
    static int product(int price){
        if (price>500){
            return (int) (price*0.05);
        }
        else{
            return (int) (price*0.04);
        }
    }
    public void show(){  
        System.out.println("this is my non static method");
    }
    public static void main(String[] args){
        int x=StaticMethodDemo.product(6000);
        int y=StaticMethodDemo.product(4000);
        StaticMethodDemo s= new StaticMethodDemo();
        System.out.println("i am inside the main method");
        System.out.println("the discount price is more than 5000 is "+x);
        System.out.println("the discount price is less than 5000 is "+y);
        s.show();

    }
}
