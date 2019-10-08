package leetcode;

/**
 * Created by Michael on 19/10/8.
 */
public class BalancedTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public static boolean isBalanced(TreeNode root) {
        return balancedTree(root).isBalanced;
    }

    private static BalancedNode balancedTree(TreeNode r){
        if (r == null) {
            return new BalancedNode(true, 0);
        }

        BalancedNode bnleft = balancedTree(r.left);
        if (!bnleft.isBalanced) {
            return new BalancedNode(false, 0);
        }

        BalancedNode bnright = balancedTree(r.right);
        if (!bnright.isBalanced) {
            return new BalancedNode(false, 0);
        }

        if (Math.abs(bnleft.height - bnright.height) > 1) {
            return new BalancedNode(false,0);
        }

        return new BalancedNode(true, Math.max(bnleft.height,
                bnright.height) + 1);
    }

    private static class BalancedNode {
        boolean isBalanced;
        int height;

        public BalancedNode(boolean isBalanced, int height){
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }
}
