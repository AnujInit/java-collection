package collectionframework.CollectionInterfaceExamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection interface has 2 methods to convert collection into array
 *  1) Object[] toArray()
 *  2) T[] toArray(T[])
 *
 *  NB: Always create Deep Copy
 */
public class ToArrayDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);

        //1) Object[] toArray()
        Object[] arr = list.toArray();
        for (Object obj : arr)
            System.out.print(obj + " ");
        System.out.println();

        //2) T[] toArray(T[])
        //Integer[] nums = new Integer[list.size()];
        //nums = list.toArray(nums);

        Integer[] nums = list.toArray(new Integer[0]);
        for (Integer num: nums)
            System.out.print(num + " ");

    }
}
