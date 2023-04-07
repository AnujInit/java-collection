package collectionframework.QueueInterfaceExamples.PriorityQueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Given cost of N items and a value sum.
 * The task is to find the maximum number of items that can be purchased using the value sum.
 */
public class PurchasingMaximumItems {

    /**
     * purchaseMax
     * @param al
     * @param sum
     * @return
     */
    static int purchaseMax(List<Integer> al, int sum) {

        /**
         * The idea is to create a min-heap of the cost array.
         * Since, we need maximum number of items that can be purchased by sum.
         * We simply need to extract items from the constructed min heap one by one,
         * and keep on subtracting that value from sum and incrementing count simultaneously.
         */

        PriorityQueue<Integer> pq =  new PriorityQueue<>(al);

        int itemCount = 0;
        while(sum > 0  && !pq.isEmpty() && pq.peek() <= sum){
            sum = sum - pq.poll();
            itemCount++;
        }
        return itemCount;
    }
    public static void main(String[] args) {
        System.out.println("Max Items Count " + Arrays.asList(1, 12, 5, 111, 200) + ": " + purchaseMax(Arrays.asList(1, 12, 5, 111, 200), 10));
        System.out.println("Max Items Count " + Arrays.asList(20, 10, 5, 30, 100) + ": " + purchaseMax(Arrays.asList(20, 10, 5, 30, 100), 35));
    }
}
