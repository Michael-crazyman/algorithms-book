package leetcode;

/**
 *
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */

public class RomanToInteger {

    public static int romanToInt(String s) {
        //base case
        if (s == null || s.length() == 0) return 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int b;
            if (c == 'I' && ((i + 1) <  s.length()) && (s.charAt( i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                b = exchange(s.charAt(i + 1)) - 1;
                i ++;
            }else if (c == 'X' && ((i + 1) <  s.length()) && (s.charAt( i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                b = exchange(s.charAt(i + 1)) - 10;
                i ++;
            }else if (c == 'C' && ((i + 1) <  s.length()) && (s.charAt( i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                b = exchange(s.charAt(i + 1)) - 100;
                i ++;
            } else {
                b = exchange(s.charAt(i));
            }

            sum = sum + b;
        }

        return sum;
    }

    private static int exchange(char c) {
        int p = 0;
        switch(c) {
            case 'I':
               p = 1;
               break;

            case 'V':
                p = 5;
                break;

            case 'X':
                p = 10;
                break;

            case 'L':
                p = 50;
                break;

            case 'C':
                p = 100;
                break;

            case 'D':
                p = 500;
                break;

            case 'M':
                p = 1000;
                break;
        }

        return p;
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        String s = "III";
        System.out.println(romanToInt(s));// should be 3
    }

    public static void test2() {
        String s = "LVIII";
        System.out.println(romanToInt(s));// should be 58
    }

    public static void test3() {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));// should be 1994
    }
}
