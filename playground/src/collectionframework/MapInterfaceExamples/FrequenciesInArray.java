package collectionframework.MapInterfaceExamples;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesInArray {
    static void printFrequencies(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(arr);
    }
}
