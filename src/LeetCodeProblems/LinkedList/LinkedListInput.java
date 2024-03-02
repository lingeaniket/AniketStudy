package LeetCodeProblems.LinkedList;

import LeetCodeProblems.LinkedList.ConvertBinaryNumberToInteger;

import java.util.List;

public class LinkedListInput {
    public static ListNode reverse(ListNode head)
    {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void PrintList(ListNode head) {
        ListNode ptr = head;
        System.out.print("[");
        if (ptr != null) {
            System.out.print(ptr.val);
            ptr = ptr.next;
            while (ptr != null) {
                System.out.print("," + ptr.val);
                ptr = ptr.next;
            }
            System.out.print("]");
        }
    }
}
