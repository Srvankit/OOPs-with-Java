import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(5);

        System.out.println(q);
    }
}