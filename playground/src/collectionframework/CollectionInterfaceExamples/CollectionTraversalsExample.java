package collectionframework.CollectionInterfaceExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionTraversalsExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,5,30,40,50);

        //Iterable interface provide iterator function. and Iterator interface has 3 methods:
        // hasNext(), next(), remove()
        // we also remove the element at iteration time
        Iterator<Integer> iterator = list.iterator();
        while ((iterator.hasNext())) {
            //next do 2 things: 1) get value 2) and then move to next
            int val = iterator.next();
            System.out.print(val + " ");
        }

        //for-each loop
        System.out.println();
        for (Integer x : list)
            System.out.print(x + " ");

        //forEach() method
        System.out.println();
        list.forEach(x -> System.out.print(x + " "));

        //stream
        System.out.println();
        list.stream().forEach(x -> System.out.print(x + " "));

        System.out.println();
        //Lazy Evaluation
        list.stream()
                .filter(x -> x > 10)
                .filter(x ->  x%2 == 0)
                .forEach(x -> System.out.print(x + " "));

    }
}
