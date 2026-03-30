
//parent class
class Universe{
    String name;
    public void show(){
        System.out.println("this is my universe");
    }
}
//child class
class Earth extends Universe{
    public void display(){
        System.out.println("this is my earth: "+name);
    }
}


public class inheritence {
    public static void main(String[] args) {
        Earth e= new Earth();
        Universe u = new Universe();
        e.name="Ankit";
        e.display();
        e.show();
        // u.display(); // can't be accessed because parent can't inherit the property of child backwards
        u.show();
    }
}
// Inheritence is a mechanism where one class aquries the properties (vairables) anh bheaviour(methods) of another class using the extends keywords.(single level inheritence)

// multiple inheritence : if there are two parents and a single child.( this is not supportable in java). 
    // to make it supportive and working - there came the concept of INTERFACE.