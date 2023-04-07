package collectionframework.QueueInterfaceExamples.DequeInterface;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceDemo {
    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<Integer>();

        // Adds element to front of queue
        d.offerFirst(10);

        // Adds element to end of queue
        d.offerLast(20);

        // Adds element to front of queue
        d.offerFirst(5);

        // Adds element to end of queue
        d.offerLast(15);

        System.out.println(d);

        // Retrieve the head element
        System.out.println("Peek First: " + d.peekFirst());

        // Retrieve the tail element
        System.out.println("Peek Last: " +d.peekLast());

        // Retrieve and remove the head element
        System.out.println("Poll First: " + d.pollFirst());

        // Retrieve and remove the tail element
        System.out.println("Poll Last: " + d.pollLast());

        System.out.println("Peek First: " + d.peekFirst());
        System.out.println("Peek Last: " + d.peekLast());
    }
}
