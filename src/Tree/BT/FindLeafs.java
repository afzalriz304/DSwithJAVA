package Tree.BT;

import Tree.TreeNode;

public class FindLeafs {
    public static void main(String[] args) {
        System.out.println(noOfLeafNodes());
    }

    public static int noOfLeafNodes() {
        TreeNode right3 = new TreeNode(-1);
        TreeNode left3 = new TreeNode(-1);
        TreeNode right2 = new TreeNode(4,left3, right3);
        TreeNode left2 = new TreeNode(-1);
        TreeNode right1 = new TreeNode(-1);
        TreeNode left1 = new TreeNode(-1);
        TreeNode right0 = new TreeNode(3, left2, right2);
        TreeNode left0 = new TreeNode(2, left1, right1);
        TreeNode root = new TreeNode(1, left0, right0);
        // Write your code here.
        if (root == null)
            return 0;
        return leafs(root, 0);

    }

    public static int leafs(TreeNode root, int count) {
        if (root == null)
            return count;
        if (root.left == null || root.right == null)
            return count;
        if (root.left.val == -1 && root.right.val == -1)
            return count + 1;
        count = leafs(root.left, count);
        count = leafs(root.right, count);
        return count;
    }
}