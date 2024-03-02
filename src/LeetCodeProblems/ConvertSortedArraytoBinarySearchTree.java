package LeetCodeProblems;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        TreeNode ans = sortedArrayToBST(arr);
        Queue<TreeNode> q = new LinkedList<>();
        printNode(ans,q);
    }

    public static void printNode(TreeNode tn, Queue<TreeNode> q){
        q.add(tn);
        q.add(null);
        while (!q.isEmpty() && q.peek() != null){
            while(q.peek() != null){
                TreeNode tree = q.poll();
                System.out.print(tree.val+" ");
                if(tree.left != null){
                    q.add(tree.left);
                }
                if(tree.right != null){
                    q.add(tree.right);
                }
            }
            q.add(q.poll());
            System.out.println();
        }

    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans = addNodes(nums, 0, nums.length-1);
        return ans;
    }
    //[-10,-3,0,5]
    public static TreeNode addNodes(int[] nums, int i, int j){
        if(i > j){
            return null;
        }
        if(i == j){
            return new TreeNode(nums[i]);
        }
        TreeNode tn = new TreeNode();

        int mid = (j+i)/2;
        tn.val = nums[mid];
        tn.left = addNodes(nums, i, mid-1);
        tn.right = addNodes(nums, mid+1, j);
        return tn;
    }
}
