package collectionframework.ListInterfaceExamples.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BalancedParanthesisProblem {

    static Map<Character, Character> map = new HashMap<>();
    static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch){
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if(!stack.peek().equals(map.get(ch)))
                        return false;
                    else
                        stack.pop();
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        String str = "{(())}";

        System.out.println(isBalanced(str));
    }
}
