package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummaryRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(summaryRanges(arr));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        if(nums.length == 0){
            return list;
        }
        if(nums.length == 1){
            String ans = ""+nums[0]+"";
            list.add(ans);
            return list;
        }
        int i=0;
        int j=1;
        int number = nums[i];
        //[0,1,2,4,5,7]
        while(j<nums.length){
            number++;
            if(nums[j] == number){
                j++;
            } else {
                if(i == j-1){
                    list.add(""+nums[i]+"");
                } else {
                    list.add(nums[i]+"->"+nums[j-1]);
                }
                i=j;
                j++;
                number = nums[i];
            }
        }
        if(i<nums.length){
            if(i<nums.length-1){
                list.add(nums[i]+"->"+nums[nums.length-1]);
            } else {
                list.add(""+nums[i]+"");
            }
        }

        return list;
    }
}
