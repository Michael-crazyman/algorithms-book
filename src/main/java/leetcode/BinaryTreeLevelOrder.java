package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrder {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        if (root == null) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {

        }

        return result;
    }

    private static void test1() {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);

        root.left = l1;
        root.right = r1;

        TreeNode ll1 = new TreeNode(4);
        TreeNode rr1 = new TreeNode(5);

        l1.left = ll1;
        l1.right = rr1;

        TreeNode ll2 = new TreeNode(6);
        TreeNode rr2 = new TreeNode(7);

        rr1.left = ll2;
        rr1.right = rr2;

        printNestedList(levelOrder(root));
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
    }

}
