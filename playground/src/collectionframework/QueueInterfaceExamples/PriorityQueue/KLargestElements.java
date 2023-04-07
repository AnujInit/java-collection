package collectionframework.QueueInterfaceExamples.PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Write an efficient program for printing K largest elements in an array. Elements in array can be in any order.
 */
public class KLargestElements {
    static void printKLargest(int arr[], int k) {

        //Create Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Insert Element in Max Heap
        for (int i = 0; i < arr.length; i++)
            pq.add(arr[i]);

        //Pop first K elements to get maximum elements
        for (int i = 0; i < k; i++)
            System.out.print(pq.poll() + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        printKLargest(new int[] {1, 23, 12, 9, 30, 2, 50}, 3);
    }
}
