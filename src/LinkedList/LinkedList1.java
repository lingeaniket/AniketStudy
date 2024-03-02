package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> node = new LinkedList<>();
        node.add(12);
        node.add(4);
        node.add(5);
        node.add(45);

        for (int i = 0; i < node.size(); i++) {
            System.out.print(node.get(i) + " -> ");
        }
    }
}
