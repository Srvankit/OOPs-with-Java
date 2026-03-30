import java.util.*;
public class ExampleSet {
    public static void main(String[] args) {
        // HashSet<Object> h = new HashSet<>();
        //  LinkedHashSet<Object> h = new LinkedHashSet<>();
        TreeSet<Object> h = new TreeSet<>(); // <> is generic
        // h.add(3);
        // h.add(4);
        // h.add(2);
        h.add("ankit");
        h.add("Anish");
        h.add("AJeet");
        // h.add('A');
        // h.add(57.0f);
        h.add("ankit");
        // h.add(null);
        // h.add(null);
        System.out.println(h);
        
    }
}

// Iterable(Interface) is the root interface for iteration, represents a collection of objects that can be traversed one by one.

//  Collection (Interface)

/*  1. List
        ArrayList
        LinkList
    2. Queue:
        ProrityQueue
        Dequeue
    Set:-
        Does not allow duplicate elements
        --> can store null value(only one null in Hashset):- faster performance
    Hashset:-
        1. no order
        2. duplicatets not allowed
        3. one null value allowed o0l
*/

//  difference between arrayist and linkedlist(write programs also)
