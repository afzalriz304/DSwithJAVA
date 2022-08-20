package String;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s0 = "[]({})";
        String s1 = "[]{})";
        System.out.println(isValid(s0));
        System.out.println(isValid(s1));
    }

    private static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (!stack.empty() && (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')')) {
                if (str.charAt(i) == ']' && !stack.peek().equals('['))
                    return false;
                else if (str.charAt(i) == ')' && !stack.peek().equals('('))
                    return false;
                else if (str.charAt(i) == '}' && !stack.peek().equals('{'))
                    return false;

                stack.pop();
            } else
                stack.push(str.charAt(i));

        }
        return stack.empty();
    }
}
