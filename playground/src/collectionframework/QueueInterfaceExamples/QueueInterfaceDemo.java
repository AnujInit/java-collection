package collectionframework.QueueInterfaceExamples;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
