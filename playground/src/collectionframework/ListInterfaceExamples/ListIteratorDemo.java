package collectionframework.ListInterfaceExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        // Create a List
        List<Integer> list = new ArrayList<Integer>();

        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);

        // Print list
        System.out.println(list);

        // Iterator pointing to position just after last element
        ListIterator<Integer> it = list.listIterator(list.size());

        // While there is a previous element of the current iterator
        while(it.hasPrevious())
        {
            int x = (Integer)it.previous();

            // Replaces last element returned by previous()
            // everytime with double of its value.
            it.set(x*2);
        }

        // Print list
        System.out.println(list);
    }
}
