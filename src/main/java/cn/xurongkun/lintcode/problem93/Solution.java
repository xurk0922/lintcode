package cn.xurongkun.lintcode.problem93;

import cn.xurongkun.lintcode.base.TreeNode;

/**
 * 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的距离。
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        int max = 0;
        if (root != null) {
            max++;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            max += left > right ? left: right;
        }



        return max;
    }
}
