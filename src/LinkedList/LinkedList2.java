package LinkedList;

import java.util.Scanner;


public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int k = sc.nextInt();

        LL node1 = new LL();

        for(int i=0; i<n; i++){
            node1.add(sc.nextInt());
        }

        node1.print();
//        node2.print();

//        node.reverseList();
//        System.out.println(node1.middleNode());
//        System.out.println(node1.mergeTwoLists(node1.returnList(), node2.returnList()));
//        System.out.println(node1.removeDuplicates(node1.returnList()));
//        System.out.println(node1.deleteDuplicates(node1.returnList()));
//        System.out.println(node1.removeNthFromEnd(node1.returnList(), m));
//        System.out.println(node1.partition(node1.returnList(), m));
//        System.out.println(node1.isPalindrome(node1.returnList()));
//        System.out.println(node1.swapPairs());
//        System.out.println(node1.rotateRight(k));
//        System.out.println(node1.sortList(node1.returnList()));
//        node.print();
//        System.out.println(node1.removeElements(k));
        System.out.println(node1.oddEvenList());
    }
}
