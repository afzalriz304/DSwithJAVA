package Tree.BT;

import Tree.TreeNode;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createAsLevelOrder(new int[]{1,2,3,-1,-1,15,-1});
        System.out.println(height(treeNode,0));
    }

    public static int height(TreeNode root,int count){
        if(root==null){
            return count;
        }
        int leftCount = height(root.left,count+1);
        int rightCount = height(root.right,count+1);
        return Math.max(leftCount,rightCount);
    }
}
