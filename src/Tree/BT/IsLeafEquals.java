package Tree.BT;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsLeafEquals {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.createAsLevelOrder(new int[]{2,2});
        TreeNode root2 = TreeNode.createAsLevelOrder(new int[]{2,2});
        System.out.println(leafSimilar(root1,root2));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        List<Integer> list1 = findLeafs(root1,new ArrayList<>());
        List<Integer> list2 = findLeafs(root2,new ArrayList<>());
        return list1.equals(list2);
    }

    public static List<Integer> findLeafs(TreeNode root,List<Integer> list){
        if(root==null){
            return list;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
            return list;
        }
        findLeafs(root.left,list);
        findLeafs(root.right,list);
        return list;
    }
}
