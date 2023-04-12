package collectionframework.SetInterfaceExamples;

import java.util.HashSet;
import java.util.TreeSet;

public class UniqueSubstringsProblem {
    public static int unique_substring(String str)
    {
        //Your code here
        HashSet<String> set = new HashSet<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            set.add(str.substring(0, i+1));
            for (int j = 1; j < n-i; j++) {
                set.add(str.substring(j, j+i+1));
            }
        }
        return set.size();
    }
    static int solve(int A, int B){
        if(A == 1)
            return 0;
        int mid = (int) (Math.pow(2, A-1) /2);
        if(B <= mid)
            return solve(A-1, B);
        else
            return 1- solve(A-1, B - mid - 1 );
    }
    public static void main(String[] args) {
        System.out.println(solve(3, 1));
        System.out.println(unique_substring("abd"));
        System.out.println(unique_substring("jaja"));
    }
}
