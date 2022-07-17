package com.zrsys.leetcode.prob75;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrder {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root, 0);
        return ans;
    }

    public void bfs(TreeNode root, int level){
        if(root == null)
            return;
        if(ans.size() < level + 1)
            ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        bfs(root.left, level + 1);
        bfs(root.right, level + 1);
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
