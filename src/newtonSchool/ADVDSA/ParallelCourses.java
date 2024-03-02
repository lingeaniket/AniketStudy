package newtonSchool.ADVDSA;

import java.util.ArrayList;
import java.util.Scanner;

class Pair{
    int a;
    int b;
    Pair(int a, int b) {
        this.a =a;
        this.b= b;
    }
}
class Node{
    int data;
    Node next;
    Node(){}
    Node(int data) {
        this.data = data;
    }
}
public class ParallelCourses {
    public static int getNodeCount(Node head) {
        Node ptr = head;
        int n=0;
        while(ptr != null) {
            ptr = ptr.next;
            n++;
        }
        return n;
    }
    public static int parallelCourse(int[] arr, ArrayList<Pair> al){
        int m=0;
        Node root = new Node();
        for(int i=0; i<al.size(); i++) {
            Pair p1 = al.get(i);
            int a= p1.a;
            int b= p1.b;
            Node n1= new Node(a);
            Node n2= new Node(b);
            n1.next = n2;
            root.next= n1;

        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        ArrayList<Pair> al = new ArrayList<>();
        while(M-->0) {
            int x= sc.nextInt();
            int y= sc.nextInt();
            Pair p1 = new Pair(x,y);
            al.add(p1);
        }
        System.out.println(parallelCourse(arr, al));
    }
}
