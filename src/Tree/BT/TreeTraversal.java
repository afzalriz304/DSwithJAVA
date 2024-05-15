package Tree.BT;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createAsLevelOrder(new int[]{3, 9, 20, 4, -1, 15, 7});
        System.out.println("Level order");
        levelOrder(treeNode);
        System.out.println();
        TreeNode treeNode0 = TreeNode.createAsLevelOrder(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("inorder");
        inOrder(treeNode0);
        System.out.println();
        System.out.println("preorder");
        preOrder(treeNode0);
        System.out.println();
        System.out.println("postorder");
        postOrder(treeNode0);

    }

    private static void postOrder(TreeNode treeNode0) {
        if(treeNode0==null)
            return;
        postOrder(treeNode0.left);
        postOrder(treeNode0.right);
        System.out.print(treeNode0.val+",");
    }

    private static void preOrder(TreeNode treeNode0) {
        if(treeNode0==null)
            return;
        System.out.print(treeNode0.val+",");
        preOrder(treeNode0.left);
        preOrder(treeNode0.right);
    }

    private static void levelOrder(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        queue.add(null);
        while (!queue.isEmpty()) {
            treeNode = queue.poll();
            if(treeNode==null){
                System.out.println();
                if(!queue.isEmpty())
                    queue.add(null);
            }
            else{
                System.out.print(treeNode.val+" ");
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }

        }
    }

    private static void inOrder(TreeNode treeNode) {
        if(treeNode==null){
            return;
        }
        inOrder(treeNode.left);
        System.out.print(treeNode.val+",");
        inOrder(treeNode.right);
    }

}
