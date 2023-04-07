package collectionframework.SetInterfaceExamples;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s
                = new LinkedHashSet<Integer>();

        // Adding keys into HashSet using add()
        s.add(40);
        s.add(10);
        s.add(20);
        s.add(30);

        // Addition of a duplicate element is
        // skipped and the order is maintained
        s.add(20);

        // Displaying the set
        System.out.println(s);
    }
}
