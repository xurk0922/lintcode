package cn.xurongkun.lintcode.problem167;

import cn.xurongkun.lintcode.base.ListNode;

/**
 * 你有两个用链表代表的整数，其中每个节点包含一个数字。数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。
 * 写出一个函数将两个整数相加，用链表形式返回和。
 */
public class Solution {
    public ListNode addLists(ListNode l1, ListNode l2) {

        ListNode head = null;       // 链表的第一个节点
        ListNode pre = null;        // 用于表示上一个节点
        int carry = 0;      // 用于表示进位
        while (l1 != null || l2 != null) {

            int sum = (l1 == null ? 0: l1.val) + (l2 == null?0: l2.val) + carry;
            if (sum >= 10) {
                carry = sum / 10;
                sum %= 10;
            } else {
                carry = 0;
            }
            ListNode node = new ListNode(sum);

            if (pre == null) {
                pre = node;
                head = pre;
            } else {
                pre.next = node;
            }
            pre = node;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {       // 循环之后进位不是0
            ListNode node = new ListNode(carry);
            pre.next = node;
        }

        return head;

    }
}
