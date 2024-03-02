package LeetCodeProblems.LinkedList;
/*
Given head which is a reference node to a singly-linked list
The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

Constraints:
The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
 */
import java.util.*;
public class ConvertBinaryNumberToInteger {
    public static int getDecimalValue(LinkedListInput.ListNode head) {
        Stack<Integer> st = new Stack<>();
        LinkedListInput.ListNode ptr = head;
        while (ptr != null) {
            st.push(ptr.val);
            ptr = ptr.next;
        }
        int n = 0;
        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop() * pow(n);
            n++;
        }
        return ans;
    }

    public static int pow(int n) {
        int m = 1;
        while (n > 0) {
            m = m * 2;
            n--;
        }
        return m;
    }

    public static void main(String[] args) {
        //LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] keys = new int[size];
        for (int i = 0; i < size; i++) {
            keys[i] = sc.nextInt();
        }
        LinkedListInput.ListNode head = null;
        for (int i = 0; i < size; i++) {
            head = new LinkedListInput.ListNode(keys[i], head);
        }
        head = LinkedListInput.reverse(head);
        System.out.println(getDecimalValue(head));
    }
}

