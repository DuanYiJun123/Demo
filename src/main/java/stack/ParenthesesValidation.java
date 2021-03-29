package stack;

import java.util.Stack;

/**
 * @Author yijun.dyj
 * @Date 2020/10/16 9:41 AM
 **/
public class ParenthesesValidation {

    public static void main(String[] args) {
        String s="()[123fdsf]23847}[]()";
        System.out.println(validate(s));
    }

    public static boolean validate(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
            if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
