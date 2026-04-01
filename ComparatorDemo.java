import java.util.*;
  
    class Student1 {
        String name;
        int id;
        int marks;

        Student1(String name, int id, int marks){
            this.name = name;
            this.marks = marks;
            this.id = id;
        }
    }

    class IdComparator implements Comparator<Student1>{

        @Override
        public int compare(Student1 s1, Student1 s2) {
            return s1.id-s2.id;
            
        }
        
    }
    class NameComparator implements Comparator<Student1>{

        @Override
        public int compare(Student1 s1, Student1 s2) {
            return s1.name.compareTo(s2.name);
            
        }
    }
    class MarksComparator implements Comparator<Student1>{

        @Override
        public int compare(Student1 s1, Student1 s2) {
            return s1.marks-s2.marks;
            
        }
        
    }

public class ComparatorDemo {

  public static void main(String[] args) {
    List<Student1> l = new ArrayList<>();
    l.add(new Student1("ankit", 1001, 97));
    l.add(new Student1("anish", 1003, 78));
    l.add(new Student1("ajeet", 1005, 89));

    System.out.println("sorting by id ");
    Collections.sort(l, new IdComparator());

    for(Student1 s:l){
        System.out.println(s.id+" "+s.name+" "+s.marks+" ");
    }

    System.out.println("sorting by name");
    Collections.sort(l, new NameComparator());

    for(Student1 s:l){
        System.out.println(s.id+" "+s.name+" "+s.marks+" ");
    }

    System.out.println("sorting by marks");
    Collections.sort(l, new MarksComparator());

    for(Student1 s:l){
        System.out.println(s.id+" "+s.name+" "+s.marks+" ");
    }
  }
}
/*

Comparator:
    When you want multiple sorting logics
    1.by name
    2.by id
    et, Then we use the comparable interface.

Fuunctional Interface:
    a Functional Interface is an interface that has only One Absrtract method
    sometimes denotes with @functionalinterface.

    - Lambda expression:- contains an anonymous functions that hai neither name nor return type -  ()-> this is the allocation of it.
    ex: if we want to print hello using any anonymouse function then:
        ()->{sout(:hello)}
        (a,b)->{sout("hello world!")}
    Syntax of lambda expression:- (paramenters) -> {method body}


*/