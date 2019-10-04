package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s){

        if (s == null || s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();
        boolean result = false;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' || c == '}' || c == ']')) {
                if (!stack.isEmpty()) {
                    char newChar = stack.pop();

                    if (c == ')' && newChar == '(') {
                        result = true;
                    }else if (c == '}' && newChar == '{') {
                        result = true;
                    }else if (c == ']' && newChar == '[') {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }

            }
        }

        if (!stack.isEmpty()) {
            result = false;
        }

        return result;
    }

    private static void test1() {
        String s = "{}";
        System.out.println(isValid(s));//true
    }

    private static void test2() {
        String s = "()[]{}";
        System.out.println(isValid(s));//true
    }

    private static void test3() {
        String s = "(]";
        System.out.println(isValid(s));//false
    }

    private static void test4() {
        String s = "([)]";
        System.out.println(isValid(s));//false
    }

    private static void test5() {
        String s = "{[]}";

        System.out.println(isValid(s));//true
    }

    private static void test6() {
        String s = "([]";
        System.out.println(isValid(s));//false
    }

    private static void test7() {
        String s = "[])";
        System.out.println(isValid(s));//false
    }

    private static void test8() {
        String s = "{{)}";
        System.out.println(isValid(s));//false
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
    }
}
