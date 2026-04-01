import java.util.*;

public class QueueDemo {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println(q.contains(10));
        System.out.println(q.contains(90));
        q.add(100);
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}

// Queue :- In java collection is a data structure that follows the FIFO principle.
// That means the element added first will be removed first
  // Elements are inserted at the end(rear)
  // Elements are removed from the first
  // Support both exception based and safe method.

// Classes:-
  // LinkedList
  // PriorityQueue
  // ArrayDequeue