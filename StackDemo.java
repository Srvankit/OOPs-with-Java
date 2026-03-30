import java.util.*;
public class StackDemo {
   public static void main(String[] args) {
    Stack<String> a = new Stack<>();
    a.push("apple");
    a.push("banana");
    a.push("mango");
    a.push("kiwi");
    System.out.println(a);
    System.out.println(a.pop());
    System.out.println("updated list"+ a);
    System.out.println(a.peek());
    System.out.println(a);
    System.out.println(a.push("guava"));
    System.out.println(a);
} 
}
