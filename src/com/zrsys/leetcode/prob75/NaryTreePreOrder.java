package com.zrsys.leetcode.prob75;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreOrder {

    public static void main(String[] args) {
        Node root = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))), new Node(2), new Node(4)));
        System.out.println(new NaryTreePreOrder().preorder(root));
    }

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return new ArrayList();
        }
        List<Integer> ans = new ArrayList();
        ans.add(root.val);
       if (root.children != null) {
           for (Node node : root.children) {
               ans.addAll(preorder(node));
           }
       }
        return ans;
    }


    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}