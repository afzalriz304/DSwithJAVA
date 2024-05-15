package Tree.BT;

import Tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class DiameterOfTree {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createAsLevelOrder(new int[]{1, 2, 3, 4, 5, 6, -1});
        int[] pair = new int[]{0,0};
        int[] result = diameter(treeNode, pair);
        System.out.println(result[0]);
    }

    public static int[] diameter(TreeNode root, int[] pair) {
        if (root == null) {
            return new int[2];
        }
        int[] leftPair = diameter(root.left,pair);
        int[] rightPair = diameter(root.right,pair);
        int op1 = leftPair[0];
        int op2 = rightPair[0];
        int op3 = leftPair[1]+rightPair[1];
        pair = new int[2];
        int height = Math.max(leftPair[1],rightPair[1])+1;
        int diameter = Math.max(op3,Math.max(op1,op2));
        pair[0]=diameter;
        pair[1]=height;
        return pair;
    }
}
