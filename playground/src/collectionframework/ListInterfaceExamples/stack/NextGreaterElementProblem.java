package collectionframework.ListInterfaceExamples.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElementProblem {
    static void nextGreater(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        int startIndex = arr.length-1;
        stack.push(arr[startIndex]);
        int nextG = -1;
        System.out.print(nextG + " ");
        for (int i = startIndex-1; i >= 0 ; i--) {

            // remove all element less than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();

            //if stack is empty means no element is greater than current one in its left.
            // set to -1. otherwise take peek value.
            nextG = stack.isEmpty() ?  -1 : stack.peek();
            System.out.print(nextG + " ");
            stack.push(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        nextGreater(new int[]{1, 2, 4, 8, 6, 10});
        nextGreater(new int[]{4, 5, 2, 25});
    }
}
