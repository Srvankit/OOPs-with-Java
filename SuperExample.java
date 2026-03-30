

class Parent{
    String name = "ankit";
    int rollno;
    Parent(int rollno){
        this.rollno= rollno;
        System.out.println("the roll number is "+rollno);
    }
    public void show(){
        System.out.println("this is my parent class show method ");
    }
}
class Child extends Parent{
    String city;
    Child(int rollno, String city){
        super(rollno);
        this.city= city;
        System.out.println("the city is "+city);
    }
    String name = "yadav";
    public void show(){
        System.out.println("this is my child class show method ");
    }
    public void display(){
        System.out.println("this is my display method ");
        System.out.println("my name is "+super.name);
        System.out.println("my surname is "+name);
        super.show();
        show();
    }
}


public class SuperExample {
    public static void main(String[] args) {
        Child c = new Child(1002, "Noida");
        c.display();
        c.show();
        // super.show();
    }
}

// we can't use super with static keyword because static belong to a class and super belong ot an object
// super is object based (it is non static in nature)
// variable overriding (using same variable with diffrent data in two classes)

// super keyword: it refers to the immediate parent class object

// it can be used inside the class:-
    // -> to access parent class variables
    // -> call parent methods
    // -> call parent class constructor

// super cannot access private members(variables and methods)
//  super cannot acess private members(varibles and method)
//  use only in inheritence of no extends no super will be use
// must be the first line in constructor
// refer to immediate parent only
 
