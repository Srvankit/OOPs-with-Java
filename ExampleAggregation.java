

class Professor{
    String name;
    String subject;

    Professor(String name,String subject){
        this.name = name;
        this.subject = subject;
    }

     void professorDetails(){
        System.out.println("Professor name is : "+name);
        System.out.println("Subject name is : "+subject);
     }
}

class Department{
    String name;
    Professor prof;

    Department(String name,Professor prof){
        this.name = name;
        this.prof = prof;
    }
    void departmentDetails(){
        System.out.println("Name of the depatment is : "+name);
        prof.professorDetails();
    }
}

public class ExampleAggregation {   // Only one class can be public in the whole program
    public static void main(String[] args){
        Professor p = new Professor("Abhijeet", "JAVA");
        Department d = new Department("CSE", p);
        d.departmentDetails();
        System.out.println(d.getClass());   
        System.out.println(d.hashCode());  // Particular object stored at a particular address
        System.out.println(d.equals(p));   // Compares the classes 
    }
}