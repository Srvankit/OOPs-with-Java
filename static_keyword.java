
public class static_keyword {

    String name;
    int rollno;
    static String collegename="kcc institute of technology and management";

    public void display(String n, int r){
        name=n;
        rollno=r;
        System.out.println("the name of the student is "+name + "the college name is "+collegename);
        System.out.println("the roll number is "+rollno);
    }
    public static void main(String[] args){
        static_keyword s1=new static_keyword();
        static_keyword s2=new static_keyword();
        static_keyword s3=new static_keyword();
        static_keyword s4=new static_keyword();
        static_keyword s5=new static_keyword();
        s1.display("a ", 062);
        s2.display("b ", 063);
        s3.display("c ", 064);
        s4.display("d ", 065);
        s5.display("e ", 066);
        System.out.println("the name of the college is "+collegename);
    }
}