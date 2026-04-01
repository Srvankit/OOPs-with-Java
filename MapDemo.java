import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        TreeMap<Integer, String> map = new TreeMap<>();
    
        
        map.put(2, "Ankit");
        map.put(4, "Anish");
        map.put(5, "Ajeet");
        map.put(3, "Ayush");
        

        System.out.println("Map "+map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.replace(5, "ankit");
        System.out.println(map);
        System.out.println(map.size());
    }

}