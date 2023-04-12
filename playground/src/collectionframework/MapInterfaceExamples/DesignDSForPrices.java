package collectionframework.MapInterfaceExamples;

import java.util.*;

/**
 * Given some items and their prices, the task is to design a data structure in order to perform the below-given operations efficiently.
 *      add(price, item): Add a new item along with its price.
 *      find(price): Fetch the list of items with price as given price.
 *      printSorted(): Print all items in order of their price in increasing order.
 *      printGreaterSorted(price): Print all items in increasing order of prices with price greater than price provided in argument.
 *      printSmallerSorted(price): Print all items in increasing order of prices with price smaller than price provided in argument.
 *
 *  Note: Prices may be duplicate.
 */
class MyDS {
    TreeMap<Integer, List<String>> map;

    public MyDS(){
        this.map = new TreeMap<>();
    }

    /**
     * Add a new item along with its price.
     * @param price
     * @param item
     */
    void add(int price, String item) {
        if(!map.containsKey(price))
            map.put(price, new ArrayList<>());
        map.get(price).add(item);
    }

    /**
     * Fetch the list of items with price as given price
     * @param price
     * @return
     */
    List<String> find(int price) {
        return map.get(price);
    }

    /**
     * Print all items in order of their price in increasing order
     */
    void printSorted() {
        for(Map.Entry<Integer, List<String>> e : map.entrySet()) {
            int p = e.getKey();
            for(String s: e.getValue())
                System.out.println(s + " " + p);
        }
    }

    /**
     * Print all items in increasing order of prices with price greater than price provided in argument
     * @param price
     */
    void printGreaterSorted(int price) {
        SortedMap<Integer, List<String>> greater = map.tailMap(price);
        for(Map.Entry<Integer, List<String>> e : greater.entrySet()) {
            int p = e.getKey();
            for(String s: e.getValue())
                System.out.println(s + " " + p);
        }
    }

    /**
     * Print all items in increasing order of prices with price smaller than price provided in argument.
     * @param price
     */
    void printSmallerSorted(int price) {
        SortedMap<Integer, List<String>> smaller = map.headMap(price);
        for(Map.Entry<Integer, List<String>> e : smaller.entrySet()) {
            int p = e.getKey();
            for(String s: e.getValue())
                System.out.println(s + " " + p);
        }
    }
}

public class DesignDSForPrices {
    public static void main(String[] args) {

    }
}
