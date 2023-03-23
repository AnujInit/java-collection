package collectionframework.ListInterfaceExamples;

import java.util.*;

/**
 * Problem: Given an array of N integers and a value K. The task is to return a list of integers from the given array whose value is less than K.
 */
public class ArrayListDemo {

    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(ArrayList<Integer> l : arr) {
            for(int i = 0; i < l.size(); i++){
                if(list.size() > i)
                    list.set(i, list.get(i) + l.get(i));
                else
                    list.add(l.get(i));
            }
        }
        return Collections.min(list);
    }

    static List<Integer> getSmaller(int arr[], int k)
    {
        List<Integer> list = new ArrayList();

        // Add those array elements in the ArrayList that are smaller than k .
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < k)
                list.add(arr[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        // Create a ArrayList
        int arr[] = {10, 40, 80, 30, 20, 15};

        List<Integer> al = getSmaller(arr, 30);

        // sort the ArrayList in ascending order
        al.sort(Comparator.naturalOrder());

        // sort the ArrayList in descending order
        al.sort(Comparator.reverseOrder());

        // Print numbers that are present in the list after calling getSmaller
        for(Integer x: al)
            System.out.println(x);

        // Collections.reverse method takes a list as a parameter and reverse the list
        System.out.println();
        Collections.reverse(al);
        al.forEach(System.out::println);

        //iterator printing
        System.out.println();
        Iterator it = al.iterator();
        while (it.hasNext()){
            Object val = it.next();
            System.out.print(val + " ");
        }
    }
}
