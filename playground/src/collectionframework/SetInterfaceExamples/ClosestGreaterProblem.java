package collectionframework.SetInterfaceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Given an array of integers, find the ceiling of every element on the right. 
 * That is the closest greater or equal element for every element on right. 
 * If there is no such element then print -1
 */
public class ClosestGreaterProblem {
    static void closestGreater(int[] arr){
        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Integer> list =  new ArrayList<>(arr.length);

        System.out.print("[");
        Arrays.stream(arr).forEach(x-> System.out.print(x + " "));
        System.out.println("]");

        for (int i = 0; i < arr.length; i++) {
            Integer greater = treeSet.ceiling(arr[i]);
            if(greater == null)
                list.add(-1);
            else
                list.add(greater);
            treeSet.add(arr[i]);
        }


        System.out.println(list);
    }
    public static void main(String[] args) {
        closestGreater(new int[] { 50, 20, 200, 100, 30});
    }
}
