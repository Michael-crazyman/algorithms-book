package leetcode;

public class SymmetricTree {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSymmetric(TreeNode root){

        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }

    public static void test1() {

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);

        root.left = left;
        root.right = right;

        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(4);
        left.left = left1;
        left.right = right1;

        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(3);

        right.left = left2;
        right.right = right2;

        System.out.println(isSymmetric(root));//should be true
    }

    public static void test2() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);

        root.left = left;
        root.right = right;

        TreeNode right1 = new TreeNode(3);
        left.left = null;
        left.right = right1;

        TreeNode right2 = new TreeNode(3);

        right.left = null;
        right.right = right2;

        System.out.println(isSymmetric(root));//should be false
    }

    public static void test3(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);

        root.left = left;
        root.right = right;

        TreeNode left1 = new TreeNode(2);
        //TreeNode right1 = new TreeNode(3);
        left.left = left1;
        left.right = null;

        TreeNode left2 = new TreeNode(2);

        right.left = left2;

        System.out.println(isSymmetric(root));
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
