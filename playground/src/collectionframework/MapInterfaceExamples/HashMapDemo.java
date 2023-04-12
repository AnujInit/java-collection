package collectionframework.MapInterfaceExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("gfg", 10);
        map.put("ide", 15);
        map.put("courses", 20);

        // Print size and content
        System.out.println(map);
        System.out.println(map.size());

        // Iterating over HashMap
        for(Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        // Check for a key
        if (map.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        map.remove("ide");
        System.out.println(map.size());

        map.put("ide", 15);

        // Check for a Value
        if (map.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Get value corresponding to passed key
        // <"ide", 15>
        System.out.println(map.get("ide"));

        // The given key is absent
        System.out.println(map.get("practice"));

    }
}
