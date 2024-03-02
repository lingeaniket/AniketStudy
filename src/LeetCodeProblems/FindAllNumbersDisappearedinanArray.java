package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int max = 1;
        //[4,3,2,7,8,2,3,1]
        for(int i=0; i<nums.length; i++){

            if(hs.contains(nums[i])){
                list.add(max);
            } else {
                hs.add(nums[i]);
            }
        }
        return list;
    }
}
