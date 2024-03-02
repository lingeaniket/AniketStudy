package newtonSchool.ADVDSA.Trees.BinaryTree;

import java.util.HashMap;
import java.util.Scanner;

public class PostOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, TreeNode> hm = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hm.put(i, new TreeNode(i));
        }
        for (int i = 1; i <= n; i++) {
            TreeNode node = hm.get(i);
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l != -1) {
                node.left = hm.get(l);
            }
            if (r != -1) {
                node.right = hm.get(r);
            }
        }
        displayPost(hm.get(1));
    }

    public static void displayPost(TreeNode root) {
        if (root == null) {
            return;
        }
        displayPost(root.left);
        displayPost(root.right);
        System.out.print(root);
    }
}
 class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        left = right= null;
    }

     @Override
     public String toString() {
         String ans =  "";
         ans += this.val +" ";
         return ans;
     }
 }
