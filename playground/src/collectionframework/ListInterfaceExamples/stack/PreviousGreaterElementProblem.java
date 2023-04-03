package collectionframework.ListInterfaceExamples.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElementProblem {
    static void prevGreater(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        int preG =-1;
        System.out.print(preG + " ");
        for (int i = 1; i < arr.length; i++) {

            // remove all element less than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            //if stack is empty means no element is greater than current one in its left.
            // set to -1. otherwise take peek value.
            preG = stack.isEmpty() ? -1 : stack.peek();
            System.out.print(preG + " ");
            stack.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {15, 10, 18, 12, 4, 6, 2, 8};

        prevGreater(arr);
    }
}
