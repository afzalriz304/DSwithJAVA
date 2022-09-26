package String;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s0 = "[]({})";
        String s1 = "[]{})";
        System.out.println(isValid(s0));
        System.out.println(isValid(s1));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')')) {
                if (s.charAt(i) == ']' && !stack.peek().equals('['))
                    return false;
                else if (s.charAt(i) == ')' && !stack.peek().equals('('))
                    return false;
                else if (s.charAt(i) == '}' && !stack.peek().equals('{'))
                    return false;

                stack.pop();
            } else
                stack.push(s.charAt(i));

        }
        return stack.empty();
    }
}
