
  abstract class Shapes{ // abstract class
    int a;
     // abstract int b; we can not make abstract variables.( because variables never perform dynamically but methods do)
     static int c;
     static{
     }
    Shapes(int a){
        this.a =a;
    }
    // constructor with abstract keyword also is invalid.

    abstract public void show();
    public void display(){
        System.out.println("this is my concreate method of abstract class - Shapes.");
    }
 }
 class Circle extends Shapes{
    Circle(int a){
        super(a);
    }
    public void show(){
        System.out.println("this is my show method in the circle class.");
    }
     public void display(){
        System.out.println("this is my concreate method of  class - circle.");
        super.display();
    }
  }
  class Demo extends Circle{
    Demo(int a){
    super(a);
    }
   public void show(){
    System.out.println("this is my show method in demo class");
    super.display();
   }
    public void display(){
        System.out.println("this is my concreate method of non-abstract class - demo.");
    }
  }
 
 // if the class is non-abstract(normal) then it can't have abstract method.
//  but an abstract class can have both normal and abstract method(should not have any body)
// variable ke aage kabhi bhi abstract nhi lagega

public class Abstraction {
     public static void main(String[] args) {
        // Shapes s = new Shapes(); - cannot make an object of abstract class
        Shapes s= new Demo(10);
        s.show();
        s.display();
    }
}
//  it is a process of hiding internal internal methods implementation and details showing only the essential functionality to the user.

//  ways to acheieve abstraction:
    // 1. abstract class(partial abstraction)
    // 2. interface (100% abstraction)

// abstract class:  a class declared using abstract keyword:- can not be instantiated(cannot create the object directly)
    // can contain:- 
        // --> abstract method (no body)
        // --> normal method (concrete method) method with body
        // --> variables
        // --> constructor

// Important points about abstraction:
   //  1. if the class contains one abstract method the class must be abstract.
   //  1. Abctract class can have:
            //--> constructor, static methods, and final method
    // cannot create object directly
    // child class must override abstract method
    // if the child class doesn't implement abstract method