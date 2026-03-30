import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        // 
        Vector<String> a = new Vector<>();
        a.add("apple");
        a.add("mango");
        a.add("apple");
        a.add("mango");
        a.add("apple");
        a.add("mango");

        System.out.println("original list "+a);

        List<String> sub = a.subList(1,3);
        System.out.println("sublist"+ sub);
        Collections.sort(a);
        System.out.println("sorted list "+a);

        System.out.println(a.get(2));
        System.out.println(a.remove(3));
        System.out.println(a.contains("kiwi"));
        System.out.println(a.set(0, "kiwi"));
        System.out.println("updaated list 1"+a);
        System.out.println(a.add("guava"));
        System.out.println(a);
        System.out.println(a.lastIndexOf("mango"));
    }
}

 /*It represent the ordered collection where:-
      Eleements are stored iin insetion order.
      You can access elements using index
      duplicate elements are allowed.

  Important classes
     1. ArrayList:
         uses a dynamic array
         fast for retrieval
         slower for access (no direct indexing internally) 
        
     2. LinkedList:
         uses doubly linkedlist
         fast for insertion/deletion
         slower for access (no directly indexing internally)
         
*/
        