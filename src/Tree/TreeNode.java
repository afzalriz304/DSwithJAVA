package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createAsLevelOrder(int[] nums) {
        TreeNode root = new TreeNode();
        if (nums == null || nums.length == 0)
            return root;
        Queue<TreeNode> queue = new LinkedList<>();
        root = new TreeNode(nums[0]);
        queue.add(root);
        int index = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            int nextLeftIndex = 2 * index + 1;

            temp.left = nextLeftIndex < nums.length && nums[nextLeftIndex]>=0
                    ? new TreeNode(nums[2 * index + 1])
                    : null;
            int nextRightIndex = 2 * index + 2;
            temp.right = nextRightIndex < nums.length && nums[nextRightIndex]>=0
                    ? new TreeNode(nums[2 * index + 2])
                    : null;
            if(temp.left!=null && temp.left.val>=0){
                queue.add(temp.left);
            }
            if(temp.right!=null && temp.right.val>=0){
                queue.add(temp.right);
            }
            index++;
        }
        return root;
    }

    public static void main(String[] args) {
        createAsLevelOrder(new int[]{3, 9, 20, -1, -1, 15, 7});

    }
}
