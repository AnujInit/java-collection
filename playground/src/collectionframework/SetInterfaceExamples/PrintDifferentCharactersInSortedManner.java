package collectionframework.SetInterfaceExamples;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Given a string str,
 * return the string with all distinct characters from the string
 * without using sorting algorithm.
 */
public class PrintDifferentCharactersInSortedManner {
    public static String sortedCharacters(String str) {
        TreeSet<Character> ts =  new TreeSet<>();

        for (int i = 0; i < str.length(); i++)
            ts.add(str.charAt(i));

        StringBuilder sb = new StringBuilder();
        ts.stream().forEach(sb::append);

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(sortedCharacters("abdbc"));
        System.out.println(sortedCharacters("fdfdfd"));
    }
}
