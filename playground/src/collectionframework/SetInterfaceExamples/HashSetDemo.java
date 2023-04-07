package collectionframework.SetInterfaceExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        // Adding keys into HashSet usind add()
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        // Displaying the HashSet
        System.out.println(h);

        // Checks for key "ide"
        System.out.println(h.contains("ide"));

        // Iterating over hashset
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");
        System.out.println();
        h.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Displaying the size of HashSet
        System.out.println(h.size());

        // Removing the key "ide"
        h.remove("ide");

        // Displaying the size of HashSet
        System.out.println(h.size());

        // Using for-each loop to traverse
        for(String s:h)
            System.out.print(s + " ");
        System.out.println();

        // Checking whether the set is empty or not
        System.out.println(h.isEmpty());

        //Print distinct elements
        System.out.println();
        System.out.println("*** Print distinct elements ***");
        int arr[] = {10, 8, 4, 10, 10, 4};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();
        HashSet<Integer> s = new HashSet<>();
        Arrays.stream(arr).forEach(s::add);
        System.out.println(s);


    }
}
