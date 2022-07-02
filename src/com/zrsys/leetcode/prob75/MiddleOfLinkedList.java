package com.zrsys.leetcode.prob75;

import com.zrsys.leetcode.prob75.MergeTwoSortedList.ListNode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
