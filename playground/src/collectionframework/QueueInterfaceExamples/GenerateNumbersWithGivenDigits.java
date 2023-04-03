package collectionframework.QueueInterfaceExamples;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given an integer N, the task is to print the first N numbers in increasing order formed using digits 5 and 6.
 */
public class GenerateNumbersWithGivenDigits {
    static void printFirstN(int n) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("5");
        queue.offer("6");
        for (int i = 0; i < n; i++) {
            String item = queue.poll();
            System.out.print(item +  " ");
            queue.add(item + "5");
            queue.add(item + "6");
        }
        queue.clear();
        System.out.println();
    }
    public static void main(String[] args) {
        printFirstN(10);
        printFirstN(5);
        printFirstN(2);
    }
}
