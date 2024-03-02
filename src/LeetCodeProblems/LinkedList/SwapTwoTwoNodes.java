package LeetCodeProblems.LinkedList;

import java.util.Scanner;

public class SwapTwoTwoNodes {
    /*public static LinkedListInput.ListNode SwapNodes(LinkedListInput.ListNode node) {
        if(node == null) {
            return node;
        }
        LinkedListInput.ListNode ptr = node;
        //2 7 1 5 9
        int n=0;
        if(ptr != null && ptr.next != null) {
            LinkedListInput.ListNode newNode= ptr.next;
            newNode.next = null;
            ptr.next = ptr.next.next;
            node = newNode;
            node.next = ptr;
            ptr = ptr.next;
            n+=2;
        }
        while(ptr != null && ptr.next != null) {
            int m=n;
            LinkedListInput.ListNode newNode= ptr.next;
            LinkedListInput.ListNode ptr1= node;
            newNode.next = null;
            ptr.next = ptr.next.next;
            while(m >0){ //    2 7 1 5 9
                ptr1= ptr1.next;
                m--;
            }
            newNode.next= ptr;
            ptr1.next = newNode;
            ptr = ptr.next;
            n+=2;
        }
        return node;

    }

     */
    public static LinkedListInput.ListNode SwapNodes(LinkedListInput.ListNode node) { //2 7 1 5 9
        LinkedListInput.ListNode dummy = new LinkedListInput.ListNode();
        dummy.next = node;
        swap(dummy);
        return dummy.next;
    }


    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //int size = sc.nextInt();

        LinkedListInput.ListNode node = new LinkedListInput.ListNode(2, null);
        node.next = new LinkedListInput.ListNode(7, null);
        node.next.next = new LinkedListInput.ListNode(1, null);
        node.next.next.next = new LinkedListInput.ListNode(5, null);
        node.next.next.next.next  = new LinkedListInput.ListNode(9, null);
        //printNode(node);
        LinkedListInput.ListNode newNode = SwapNodes(node);
        printNode(newNode);
    }
    public static void printNode(LinkedListInput.ListNode node){
        LinkedListInput.ListNode ptr = node;
        while(ptr != null) {
            System.out.print(ptr.val+ " ");
            ptr = ptr.next;
        }
    }
    public static void swap(LinkedListInput.ListNode node) {// dummy-2-7-1-5-9
        if(node == null) {
            return;
        }
        LinkedListInput.ListNode first = node.next;// first= 2-7-1-5-9;
        LinkedListInput.ListNode second = null;
        if(first != null) {
            second = first.next;// 7-1-5-9;
        }
        if(second != null){
            LinkedListInput.ListNode secondNext = second.next; // 1-5-9
            second.next = first;// 7-2-7-1-5-9
            node.next = second; // dummy-7-2-7-1-5-9
            first.next = secondNext; //first= 2-1-5-9
        }
    }
}
