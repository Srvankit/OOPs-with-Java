
public class rough {
    int x=5;
    static int y;
    static{
        y=20;
        System.out.println("hello class");
        }

    public void display(){
        System.out.println("this is my diplay method");
        System.out.println("the value of the variable x is "+x);
        System.out.println("the value of the y is "+y);
    }
    public static void main(String[] args){
        System.out.println("ankit yadav");
        rough r = new rough();
        rough r1= new rough();
        r.display();
        r1.display();
    }
}

// rules for static:
// 1. no method name;
// 2. no return type; 
// 3. no parameter;

// static variables that are initialized have the highest priority (even more than main)
