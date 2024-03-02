package newtonSchool;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next=null;
    }
}

public class ReverseLL {
    public static Node reverseNode(Node head){ //  1 2 3 4 5
        Node cur = head;
        Node prev = null;
        Node nxt;
        while(cur != null ) {
            nxt = cur.next; //2345
            cur.next = prev;
            prev = cur;

            cur = nxt;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        Node node= new Node(n);
        while(m-->1) {
            int j= sc.nextInt();
            Node node2 = new Node(j);
            node.next = node2;
        }
        printList(reverseNode(node));
    }
    public static void printList(Node head) {
        Node ptr =head;
        while(ptr != null) {
            System.out.println(ptr.data +" ");
            ptr = ptr.next;
        }
    }
}
