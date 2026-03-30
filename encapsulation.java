

public class encapsulation {

    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    public static void main(String[] args){
        encapsulation en= new encapsulation();
        en.setAge(10);
        System.out.println("the age is "+en.getAge());
    }
}
//Wrapping variables and methods together into a single unit and restricting direct access to the data.
// Why do we need encapsulation:
    // 1. security: data can not be accessed directlly.
    // 2. data hiding : internal implementation is hidden.