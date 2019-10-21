package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {

    public static List<List<Integer>> largeGroupPositions(String s){
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            char currentChar = arr[i];
            int start = i;
            int end = i;

            while (i < arr.length - 1 && arr[i+1] == currentChar) {
                end++;
                i++;
            }

            if (end - start >= 2) {
                List<Integer> l = new ArrayList<>();
                l.add(start);
                l.add(end);
                result.add(l);
            }
        }

        return result;
    }

    private static void test1(){
        String s = "abcxxxxyy";
        printNestedList(largeGroupPositions(s));
    }

    private static void test2(){
        String s = "abc";
        if (largeGroupPositions(s).isEmpty()) {
            System.out.println("[]");
            return;
        }
        printNestedList(largeGroupPositions(s));
    }

    private static void test3() {
        String s = "abcdddeeeeaabbbcd";
        printNestedList(largeGroupPositions(s));
    }

    private static void test4() {
        String s = "aaa";
        printNestedList(largeGroupPositions(s));
    }

    private static void printNestedList(List<List<Integer>> result){
        for (List<Integer> l : result) {
            for (Integer ll : l) {
                System.out.print(ll + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}
