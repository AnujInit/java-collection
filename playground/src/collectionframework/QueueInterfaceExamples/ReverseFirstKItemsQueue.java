package collectionframework.QueueInterfaceExamples;

import java.util.*;

/**
 * Given an integer k and a queue of integers,
 * we need to reverse the order of the first k elements of the queue,
 * leaving the other elements in the same relative order.
 */
public class ReverseFirstKItemsQueue {
    static void reverseK(Queue<Integer> q, int k){

        if(q.isEmpty() || k < 0) return;

        //Create an Auxiliary Stack of size K.
        Deque<Integer> stack  = new ArrayDeque<>();

        //Put first K items from the front of the queue into the stack.
        for (int i = 0; i < k; i++)
            stack.push(q.poll());

        //Remove items one by one from the stack and put them back into the queue,
        // so that they are added in the reversed order.
        while (!stack.isEmpty())
            q.offer(stack.pop());

        //Now, to arrange first N-K elements in the queue at their required position,
        // take them one by one from the queue, and insert them back into the queue.
        for (int i = 0; i < q.size() -k; i++)
            q.offer(q.poll());


    }
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        Queue<Integer> q =  new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(q);
        reverseK(q, 5);
        System.out.println(q);

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        q =  new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(q);
        reverseK(q, 4);
        System.out.println(q);

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();






    }
}
