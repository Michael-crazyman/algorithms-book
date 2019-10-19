package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();

        inOrderTraversal(root, list);

        return list;
    }

    public static void inOrderTraversal(TreeNode root, List<Integer> list){
        if (root != null) {
            if (root.left != null) {
                inOrderTraversal(root.left, list);
            }

            list.add(root.val);

            if (root.right != null) {
                inOrderTraversal(root.right, list);
            }

        }
    }

    public static void test1() {
        TreeNode root = new TreeNode(1);
        TreeNode rightNode = new TreeNode(2);
        TreeNode subLeftNode = new TreeNode(3);

        root.right = rightNode;
        rightNode.left = subLeftNode;

        printList(inOrderTraversal(root));
    }

    private static void printList(List<Integer> list){
        list.forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        test1();
    }
}
