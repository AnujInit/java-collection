package collectionframework.IterableInterfaceExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

    static void removeEben(Collection<Integer> nums){
        //Iterable interface provide iterator function. and Iterator interface has 3 methods:
        // hasNext(), next(), remove()
        Iterator<Integer> iterator = nums.iterator();
        while ((iterator.hasNext())) {
            //next do 2 things: 1) get value 2) and then move to next
            int val = iterator.next();
            if(val%2 == 0)
                // remove the previous item from pointer.
                iterator.remove();
        }
    }

    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(20);

        System.out.println(nums);
        removeEben(nums);
        System.out.println(nums);
    }
}
