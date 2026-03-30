import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> l= new LinkedList<>();

        l.add("mango");
        l.add("banana");
        l.add("kiwi");
        l.add("apple");
        l.add("pineapple");
        l.add("watermelon");
        System.out.println("linked list is "+l);

        System.out.println(l.peek());
        System.out.println(l.peekLast());
        System.out.println(l.peekFirst());

        System.out.println(l.poll());
        System.out.println(l);
        System.out.println(l.pollLast());
        System.out.println(l);

        System.out.println(l.offer("guava"));
        System.out.println(l);
        System.out.println(l.add("grapes"));
        System.out.println(l);
        // System.out.println(l.reverse());
        Collections.sort(l);
        System.out.println(l);
    }
}

/* 
    Vector- oldest classes used to store dynaimic array.
        1. Thread safe
        2. Slower than ArrayList
        3. It stores element in an unorderwed manner
        4. Allow duplicate values
        5. Allow null value
        6. Automatically resize when the element is added.
*/
