import java.util.*;

class Student2 implements Comparable<Student2>{  // here student2 will act like datatype

    String name;

    Student2(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Student2 s) {
        return this.name.compareTo(s.name);
    }
}



public class ComparableDemo {
    public static void main(String[] args) {
        List<Student2> l = new ArrayList<>();
            l.add(new Student2("ankit"));
            l.add(new Student2("anish"));
            l.add(new Student2("ajeet"));
            Collections.sort(l);

            for(Student2 s: l){           
                System.out.println(s.name);
            }
    }
}

/*

Comparable in Java: Comarable is an interface used to define the natural (default) sorting of the objects.

it is present in : java.lang.Comparable


Why do we need comparable:
    In java, sorting works easily for: 
    int, float, String(already have natural order)

But for custom objects(like student, Employee), Java doesn't know how to sort.

So we yse Comparable to define that logic:

Methods in Comparable:
int compareTo(T o)

How compareTo() works:
    It returns:
        0 : When both the objects are equal
        Positive(>0) : When current object is Greater
        Negative (<0) : When currrent object is smaller4


For each loop:

    (datatype variable : array or collection)

*/

