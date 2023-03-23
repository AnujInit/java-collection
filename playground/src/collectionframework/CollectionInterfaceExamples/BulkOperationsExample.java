package collectionframework.CollectionInterfaceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperationsExample {
    public static void main(String[] args) {

        //RemoveAll
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(10);
        list1.add(30);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list1.removeAll(list2);
        System.out.println("RemoveAll: " + list1);

        //RetainAll
        list1.clear();
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(10);
        list1.add(30);
        list2.clear();
        list2.add(10);
        list2.add(20);
        list1.retainAll(list2);
        System.out.println("RetainAll: " + list1);

        //RemoveIf
        list1.clear();
        list1.add(10);
        list1.add(15);
        list1.add(30);
        list1.add(19);
        list1.removeIf((n)-> n%2==0);
        System.out.println("RemoveIf: " + list1);
    }
}
