package newtonSchool.ADVDSA.Trees.BST;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(){}
    Node(int data){
        this.data = data;
        left=right=null;
    }
}
public class MaxDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int min=0;
        int max=0;

        Scanner sc1 = new Scanner(str);
        Node root= new Node();
        if(sc1.hasNextInt()){
            int n= sc1.nextInt();
            max= n;
            min= n;
            if(str.contains("null")){
                min=0;
            }
        }
        while(sc1.hasNext()){
            if(sc1.hasNextInt()){
                int i = sc1.nextInt();
                if(i < min){
                    min =i;
                }
                if(i > max){
                    max= i;
                }
            } else if(sc1.next() != "") {
                continue;
            }
        }
        System.out.println((min*max) - (min+max));

    }

}
