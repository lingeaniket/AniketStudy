package LeetCodeProblems;

import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        while(idx < nums.length){
            nums[idx++] = 0;
        }
    }
}
