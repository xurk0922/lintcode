package cn.xurongkun.lintcode.problem93;

import cn.xurongkun.lintcode.base.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void maxDepth() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;


        System.out.println(solution.maxDepth(node1));


    }

}