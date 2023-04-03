package collectionframework.ListInterfaceExamples.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseOrdersOfItems {
    static void reverseOrder(List<Integer> list){
        Stack<Integer> s = new Stack<Integer>();

        // Push all the elements in the list into the stack. The last element of
        // the list will be at the top and 1st element at the bottom of the stack.
        for(Integer x: list)
            s.push(x);

        // Pop the stack and insert back into the list.
        for(int i=0; i<list.size(); i++)
        {
            list.set(i, s.pop());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        reverseOrder(list);

        System.out.println(list);
    }
}
