
public class DemoConstructor{
    int x; // instance variable
    String name; // instance variable

    DemoConstructor(){
        System.out.println("this is a default constructor");
    }

    DemoConstructor(int a, String n){
        System.out.println("this is a key parametrized constructor");
        this.x=a;
        this.name=n;
    }

    public void show(){
        System.out.println(x);
        System.out.println(name);
    }
    public static void main(String[] args){
        DemoConstructor d= new DemoConstructor(10, "ayush"); // acting as a default constructor...
        
        // We can also create a object without using any reference variable directly like - new DemoConstructor(); 
        
        // d.x=45;
        // d.name="ankit";
        // System.out.println("this roll no. is "+d.x);
        //  System.out.println("this roll no. is "+d.name);
         d.show();
    }
}
/*Rule of constructor:-
1. constructor name must be same as the name of the class.
2. constructor is always created with new keyword.
3. constructor has no return type.
4. constructor is automatically called when the object is created. */ 