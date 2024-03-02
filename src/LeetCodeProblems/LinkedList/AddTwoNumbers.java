package LeetCodeProblems.LinkedList;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1= l1;
        ListNode ptr2= l2;
        ListNode node = new ListNode(-1);
        ListNode ptr3= node;
        int rem=0;
        while(ptr1 != null & ptr2 != null){
            int m1= ptr1.val;
            int m2= ptr2.val;
            int k= m1+m2;
            k= k + rem;
            int n= k%10;
            rem = k/10;
            ptr3.next = new ListNode(n);
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            ptr3= ptr3.next;
        }
        while(ptr1 != null){
            int k= ptr1.val + rem;
            int n= k%10;
            rem = k/10;
            ptr3.next = new ListNode(n);
            ptr1 = ptr1.next;
            ptr3= ptr3.next;
        }
        while(ptr2 != null){
            int k= ptr2.val + rem;
            int n= k%10;
            rem = k/10;
            ptr3.next = new ListNode(n);
            ptr3= ptr3.next;
            ptr2 = ptr2.next;
        }
        if(rem != 0){
            ptr3.next = new ListNode(rem);
        }
        return node.next;

    }
    public static void printList(ListNode node){
        ListNode ptr = node;
        while(ptr != null){
            System.out.print(ptr.val +" ");
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        ListNode l1= new ListNode(-1);
        ListNode ptr1= l1;
        for(int i=0; i<N; i++){
            ptr1.next = new ListNode(sc.nextInt());
            ptr1 = ptr1.next;
        }
        int M= sc.nextInt();
        ListNode l2= new ListNode(-1);
        ListNode ptr2= l2;
        for(int i=0; i<M; i++){
            ptr2.next = new ListNode(sc.nextInt());
            ptr2 = ptr2.next;
        }
        printList(addTwoNumbers(l1.next, l2.next));

    }
}
