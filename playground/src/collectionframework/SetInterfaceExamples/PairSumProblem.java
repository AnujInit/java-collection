package collectionframework.SetInterfaceExamples;

import java.util.HashSet;
import java.util.Set;

public class PairSumProblem {
    static boolean isPairSumExist(int[] arr, int sum){

        Set<Integer> set =  new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            set.add(sum-arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPairSumExist(new int[] {5, 9, 8, 13, 2, 4}, 7));
        System.out.println(isPairSumExist(new int[] {5, 9, 8, 13, 2, 4}, 3));
        System.out.println(isPairSumExist(new int[] {5, 9, 8, 13, 2, 4}, 8));
        System.out.println(isPairSumExist(new int[] {5, 9, 8, 13, 2, 4}, 13));
    }
}
