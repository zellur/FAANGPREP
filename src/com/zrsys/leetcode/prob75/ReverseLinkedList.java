package com.zrsys.leetcode.prob75;

import com.zrsys.leetcode.prob75.MergeTwoSortedList.ListNode;


public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        System.out.println(new ReverseLinkedList().reverseList(listNode1));
    }
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;

        while (head != null) {
            tail = new ListNode(head.val, tail);
            head = head.next;
        }
        return tail;
    }
}
