package Tree.BT;

import Tree.TreeNode;

public class IsBalanced {
    public static void main(String[] args) {
        //TreeNode root = TreeNode.createAsLevelOrder(new int[]{3, 9, 20, -1, -1, 15, 7});
        //TreeNode root = TreeNode.createAsLevelOrder(new int[]{1,2,3,4,5,6,-1,8});
        TreeNode root = TreeNode.createAsLevelOrder(new int[]{1, 2, 2, 3, -1, -1, 3, 4, -1, -1, 4});
        int[] result = isBalanced(root, new int[2]);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] isBalanced(TreeNode root, int[] pair) {
        if (root == null)
            return new int[]{1,0};

        int[] leftBalance = isBalanced(root.left, pair);
        int[] rightBalance = isBalanced(root.right, pair);
        int leftHeight = leftBalance[1];
        int rightHeight = rightBalance[1];
        int isBalanced = Math.abs(leftHeight - rightHeight) <= 1
                && leftBalance[0] == 1
                && rightBalance[0] == 1
                ? 1 : 0;
        pair = new int[2];
        pair[0] = isBalanced;
        pair[1] = Math.max(leftHeight, rightHeight) + 1;
        return pair;
    }
}
