package LeetCodeProblems.ClassBased;

import java.util.Scanner;

public class NumArray {
    int[] prefix;

    public NumArray(int[] nums){
        int n = nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1 ; i < n; i++){
            prefix[i] = nums[i] + prefix[i - 1];
        }
    }

    public int sumRange(int left, int right){
        return prefix[right] - ((left == 0)? 0: prefix[left - 1]);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        NumArray numArray = new NumArray(arr);

        System.out.println(numArray.sumRange(left, right));
    }
}
