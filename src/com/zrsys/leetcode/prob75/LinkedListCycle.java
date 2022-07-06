package com.zrsys.leetcode.prob75;

import com.zrsys.leetcode.prob75.MergeTwoSortedList.ListNode;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null)      //if head node is null return null
            return null;

        ListNode slow = head;       // take two pointers pointing head node to detect loop
        ListNode fast = head;

        while (fast != null && fast.next != null) {       //if fast pointer reach to null, come out from the loop, there's no cycle
            slow = slow.next;                         //move slow pointer by one step
            fast = fast.next.next;                    //move fast pointer by two steps

            if (slow == fast) {                         // if both pointer meets it means there's a cycle in linked list
                slow = head;                          //to detect cycle where it begins from point slow to head
                while (slow != fast) {                  //increase bt one step both of the pointer till both will not reach at same node
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;                        //return any one of them (from here cycle begins)
            }

        }

        return null;
    }
}
