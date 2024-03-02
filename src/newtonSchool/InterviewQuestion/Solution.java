package newtonSchool.InterviewQuestion;

import java.util.Scanner;

public class Solution {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val= val;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Node head = new Node(-1);
        Node ptr = head;
        int n= sc.nextInt();
        while(n-->0){
            ptr.next = new Node(1);
        }
    }
}
