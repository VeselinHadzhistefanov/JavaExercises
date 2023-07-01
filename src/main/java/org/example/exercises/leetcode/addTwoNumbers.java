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

        int num1 = 0;
        int num2 = 0;



        int pow = 1;
        while (l1 != null) {
            num1 += pow * l1.val;
            pow *= 10;
            l1 = l1.next;
        }

        pow = 1;
        while (l2 != null) {
            num2 += pow * l2.val;
            pow *= 10;
            l2 = l2.next;
        }

        int sum = num1 + num2;
        ListNode listNode;

        int remainder = (sum / 10) * 10;
        listNode = new ListNode(sum - remainder);
        sum = sum / 10;
        ListNode result = listNode;

        while (sum != 0) {
            remainder = (sum / 10) * 10;
            ListNode listNode1 = new ListNode(sum - remainder);
            listNode.next = listNode1;
            sum = sum / 10;
            listNode = listNode1;
        }

        return result;
    }
}
