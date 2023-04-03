package collectionframework.ListInterfaceExamples.stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
