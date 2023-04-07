package collectionframework.SetInterfaceExamples;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        // First array arr1[]
        int arr1[] = {7, 2, 9, 15, 10};

        // Second array arr2[]
        int arr2[] = {5, 10, 7, 3, 2, 20, 9};

        HashSet<Integer> s1 = new HashSet<>();
        Arrays.stream(arr1).forEach(s1::add);
        System.out.println(s1);

        HashSet<Integer> s2 = new HashSet<>();
        Arrays.stream(arr2).forEach(s2::add);
        System.out.println(s2);

        //Intersection
        s1.retainAll(s2);
        System.out.println(s1);


    }
}
