package LeetCodeProblems.LinkedList;

import java.util.Scanner;

public class RemoveDuplicatesFromLinkedList {
    public static LinkedListInput.ListNode deleteDuplicates(LinkedListInput.ListNode head) {
        LinkedListInput.ListNode ptr1= head;
        if(head== null){
            return head;
        }
        while(ptr1.next != null) {
            if(ptr1.next.val == ptr1.val) {
                ptr1.next= ptr1.next.next;
            } else {
                ptr1 = ptr1.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] keys = new int[n];
        for (int i = 0; i < n; i++) {
            keys[i] = sc.nextInt();
        }
        LinkedListInput.ListNode head = null;
        for (int i = 0; i < n; i++) {
            head = new LinkedListInput.ListNode(keys[i], head);
        }
        head = LinkedListInput.reverse(head);
        LinkedListInput.PrintList(deleteDuplicates(head));
    }
}
