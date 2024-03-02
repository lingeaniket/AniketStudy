package newtonSchool.ADVDSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    static class Solution {
        static int ans;
        public static int getCount(Node root,int l, int h) {
            ans=0;
            dfs(root,l,h);
            return ans;
        }
        public static void dfs(Node root,int l,int h){
            if(root==null)return;
            if(root.data>=l && root.data<=h){
                ans++;
                dfs(root.left,l,h);
                dfs(root.right,l,h);
            }else if(root.data<l){
                dfs(root.right,l,h);
            }else{
                dfs(root.left,l,h);
            }
        }
    }
    public static Node buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length) {
                break;
            }
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    public static void printInorder(Node root) {
        if(root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            Node root = buildTree(s);
            Solution g = new Solution();
            System.out.println(g.getCount(root,a,b));
    }
}
