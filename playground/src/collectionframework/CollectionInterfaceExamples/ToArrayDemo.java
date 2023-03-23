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

        int x = 2;
        int y = 0;
        for ( ; y < 10; ++y)
        {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else
                System.out.print(y + " ");
        }

        System.out.println();

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

        // there is an array parameter and an array return value.
        // The main purpose of the passed array is to tell the type of array. The returned array is of the same type as the passed array.
        //  1) If the passed array has enough space, then elements are stored in this array itself.
        //  2) If the passed array doesn’t have enough space, a new array is created with the same type and size of the given list.
        //  3) If the passed array has more space, the array is first filled with list elements, then null values are filled.
        Integer[] nums = list.toArray(new Integer[0]);
        for (Integer num: nums)
            System.out.print(num + " ");

    }
}
