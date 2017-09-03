package cn.xurongkun.lintcode.problem167;

import cn.xurongkun.lintcode.base.ListNode;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void addLists() throws Exception {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;


        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(1);
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7 = null;

        ListNode res = solution.addLists(n1, n4);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

}