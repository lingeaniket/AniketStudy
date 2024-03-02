package LeetCodeProblems;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
            } else {
                hs.add(nums[i]);
            }
        }
        Iterator<Integer> it = hs.iterator();
        return it.next();
    }
}
