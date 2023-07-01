package org.example.exercises.leetcode;

public class addTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4, node1);
        ListNode node3 = new ListNode(2, node2);

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(6, node4);
        ListNode node6 = new ListNode(5, node5);

        ListNode listNode = addTwoNumbers(node3, node6);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int remainder = 0;

        ListNode head = new ListNode();
        ListNode prev = null;
        while (l1 != null || l2 != null) {
            int num1 = 0;
            if (l1 != null)
                num1 = l1.val;

            int num2 = 0;
            if (l2 != null)
                num2 = l2.val;

            int sum = num1 + num2 + remainder;

            if (sum >= 10) {
                remainder = 1;
                sum = sum - 10;
            } else {
                remainder = 0;
            }

            head = new ListNode(sum, prev);
            prev = head;

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }

        if (remainder == 1) {
            head = new ListNode(1, prev);
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
