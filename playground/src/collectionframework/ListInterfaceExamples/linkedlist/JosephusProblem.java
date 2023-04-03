package collectionframework.ListInterfaceExamples.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class JosephusProblem {
    static int josephus(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.offer(i);
        }

        //require to remove element at the time of iterate
        Iterator<Integer> it = list.iterator();

        //Circular Linked list
        while (list.size() > 1) {
            int count =0;
            while (count < k){

                //condition to check end of doubly linked lit
                while (it.hasNext() && count < k){
                    it.next();
                    count++;
                }

                //reset pointer to first position
                if(count < k){
                    it = list.iterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return list.getFirst();
    }
    public static void main(String[] args) {

    }
}
