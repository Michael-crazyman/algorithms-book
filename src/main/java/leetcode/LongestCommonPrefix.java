package leetcode;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String first = strs[0];
        for (int i=0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1(){
        String[] ss = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(ss));// should be  fl
    }

    public static void test2() {
        String[] ss = {"a"};
        System.out.println(longestCommonPrefix(ss));// should be a
    }

    public static void test3() {
        String[] ss = {"aa", "a"};
        System.out.println(longestCommonPrefix(ss));// should be a
    }
}
