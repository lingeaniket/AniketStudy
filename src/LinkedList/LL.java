package LinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;
    public LL () {
        this.size = 0;
    }

    public ListNode returnList(){ return head;}

    public ListNode removeDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null && p.next != null){
            if(p.val == p.next.val){
                p.next = p.next.next;
//                p = p.next;
            } else {
                p = p.next;
            }
        }

        print(head);

        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        HashSet<Integer> hs = new HashSet<>();

        ListNode p = head;

        while(p != null && p.next != null){
            if(p.val == p.next.val){
                hs.add(p.val);
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        ListNode uniq = new ListNode(-1);
        ListNode pointer = uniq;
        p = head;

        while(p != null){
            if(hs.contains(p.val)){
                p = p.next;

            } else {
                pointer.next = p;
                pointer = pointer.next;
                p = p.next;
            }
        }
        if(pointer != null) {
            pointer.next = null;
        }
        print(uniq.next);
        return uniq.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode list3 = new ListNode(-1);
        ListNode p3 = list3;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                p3.next = p1;
                p3 = p3.next;
                p1 = p1.next;
            } else {
                p3.next = p2;
                p3 = p3.next;
                p2 = p2.next;
            }
        }

        if(p1 != null) {
            p3.next = p1;
        }

        if (p2 != null) {
            p3.next = p2;
        }

        print(list3.next);

        return list3.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        int length = size(head);
        if(length == n){
            head = head.next;
//            print(head);
            return head;
        }
        ListNode pointer = head;
        int fromFirst = length-n;
        for(int i=1; i<fromFirst; i++){
            pointer = pointer.next;
        }

        if(pointer.next != null){
            pointer.next = pointer.next.next;
        }
//        print(head);

        return head;
    }

    public ListNode partition(ListNode head, int x){
        ListNode node1 = new ListNode(-1);
        ListNode node2 = new ListNode(-1);
        ListNode p1 = node1;
        ListNode p2 = node2;
        ListNode pt = head;
        while(pt != null){
            if(pt.val < x){
                p1.next = pt;
                p1 = p1.next;
            } else {
                p2.next = pt;
                p2 = p2.next;
            }
            pt = pt.next;
        }
        p2.next = null;
        p1.next = node2.next;
        return node1.next;
    }

    public boolean isPalindrome(ListNode head) {
        int num=0;
        int rev=0;
        int mul=1;
        while(head!=null){
            num=num*10+head.val;
            rev=head.val*mul+rev;
            mul*=10;
            head=head.next;
        }

        if(num==rev)
        {
            return true;
        }
        return false;
    }

    public void print() {
        ListNode ptr1 = head;

        while (ptr1 != null){
            System.out.print(ptr1.val +" -> ");
            ptr1 = ptr1.next;
        }
        System.out.println("null");
    }

    public void print(ListNode head) {
        ListNode ptr1 = head;

        while (ptr1 != null){
            System.out.print(ptr1.val +" -> ");
            ptr1 = ptr1.next;
        }
        System.out.println("null");
    }

    public void add(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if( tail == null) {
            tail = head;
        }

        size++;
    }

    public int size(ListNode head){
        ListNode pointer = head;
        int length = 0;
        while(pointer != null){
            length++;
            pointer = pointer.next;
        }

        return length;
    }

    public ListNode reverseList(){
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode next = current.next;
        ListNode prev = null;

        while(next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = current.next;
        }

        current.next = prev;
        head = current;

        return head;

    }

    public ListNode middleNode() {
        ListNode current = head;
        int length = size(current);
        int mid = length/2;

        for (int i = 0; i <mid ; i++) {
            current = current.next;
        }

        print(current);


        return current;
    }

    public ListNode swapPairs() {
//        if(head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode current = head;
//        ListNode newNode = new ListNode(-1, head);
//        ListNode prev = newNode;
//        ListNode next = head.next;
//
//        while(current != null){
//            current.next = next.next;
//            next.next =current;
//            prev.next = next;
//            prev = current;
//            if(current.next != null) current = current.next;
//            else break;
//            if(current.next != null) next = current.next;
//            else break;
//        }
//
//        print(newNode.next);
//        return newNode.next;
        if(head==null || head.next==null) return head;
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode p=d;
        ListNode c=head;
        ListNode f=head.next;

        while(c!=null && f!=null){
            c.next=f.next;
            p.next=f;
            f.next=c;

            p=c;
            c=c.next;
            if(c!=null)
                f=c.next;
        }
        print(d.next);
        return d.next;
    }

    public ListNode rotateRight(int k) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode next = head.next;

        int length = size(head);

        int rotate = length - (k%length);
        if(length == rotate) return head;
        for(int i=1; i<rotate; i++){
            curr = next;
            next = next.next;
        }

        curr.next = null;
        ListNode newNode = next;
        while(newNode != null && newNode.next !=null) {
            newNode = newNode.next;
        }



        newNode.next = head;

        print(next);

        return next;
    }

    public  ListNode removeElements(int k){
        if(head == null) return head;
        if(head.next == null){
            if(head.val == k){
                return null;
            } else {
                return head;
            }
        }
        while(head != null && head.val == k){
            head = head.next;
        }
        ListNode pointer = head;
        while(pointer != null) {
            if(pointer.next!= null && pointer.next.val == k){
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }

        print(head);

        return head;
    }

    public ListNode oddEvenList(){ //by odd even indices
        if(head == null || head.next == null) return head;
        ListNode pointer = head;
        ListNode odd = new ListNode(-1), even = new ListNode(-1);
        ListNode p1 = odd, p2=even;

        boolean isodd = true;
        while(pointer != null) {
            if(isodd) {
                p1.next = pointer;
                p1 = p1.next;
            } else {
                p2.next = pointer;
                p2 = p2.next;
            }
            pointer = pointer.next;
            isodd = !isodd;
        }
        p2.next = null;
        p1.next = even.next;
        print(odd.next);
        return odd.next;
    }

    public ListNode sortList(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode slow=head;
            ListNode fast=head;
            ListNode prev=null;

            while(fast!=null && fast.next!=null){
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            prev.next=null;
            ListNode l1=sortList(head);
            ListNode l2=sortList(slow);
            ListNode newNode = mergeTwoLists(l1, l2);
//            print(newNode);
            return newNode;
        }

    private class ListNode {
        private int val;
        private ListNode next;
        public ListNode(int val){
            this.val = val;
        }

        public ListNode() {

        }

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}