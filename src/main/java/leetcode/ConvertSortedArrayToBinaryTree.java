package leetcode;

/**
 * Created by Michael on 19/10/8.
 */
public class ConvertSortedArrayToBinaryTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        return convert(nums, 0, nums.length - 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private static TreeNode convert(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums, start, mid - 1);
        root.right = convert(nums, mid + 1, end);

        return root;
    }
}
