package com.zrsys.leetcode.prob75;

public class MergeTwoSortedList {

    /*
    * You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
    * */

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        System.out.println(new MergeTwoSortedList().mergeTwoLists(listNode1, listNode2));
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                tail.next =list1;
                list1 = list1.next;
            }  else {
                tail.next =list2;
                list2 = list2.next;
            }
            tail = tail.next;

        }
        tail.next = (list1!=null) ? list1 : list2;
        return head.next;
    }


    
 public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }


     @Override
     public String toString() {
         return "ListNode{" +
                 "val=" + val +
                 ", next=" + next +
                 '}';
     }

 }
}

