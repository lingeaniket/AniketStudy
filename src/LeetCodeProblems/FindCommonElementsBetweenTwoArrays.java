package LeetCodeProblems;

import java.util.*;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num1 = new int[sc.nextInt()];
        for(int i=0; i<num1.length; i++){
            num1[i] = sc.nextInt();
        }
        int[] num2 = new int[sc.nextInt()];
        for(int i=0; i<num2.length; i++){
            num2[i] = sc.nextInt();
        }
        int[] ans = findIntersectionValues(num1, num2);

        for(int i=0; i<2; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
//        int max1 = 0;
//        int max2 = 0;
//
//        ArrayList<Integer> l1 = new ArrayList<>();
//        for(int i=0; i<nums1.length; i++){
//            l1.add(nums1[i]);
//        }
//        ArrayList<Integer> l2 = new ArrayList<>();
//        for(int i=0; i<nums2.length; i++){
//            l2.add(nums2[i]);
//            if(l1.contains(nums2[i])){
//                max2++;
//            }
//        }
//        for(int i=0; i<nums1.length; i++){
//            if(l2.contains(nums1[i])){{
//                max1++;
//            }}
//        }
//        return new int[]{max1, max2};

        // OR
        int[] s1 = new int[101];
        int[] s2 = new int[101];
        for (int x : nums1) {
            s1[x] = 1;
        }
        for (int x : nums2) {
            s2[x] = 1;
        }
        int[] ans = new int[2];
        for (int x : nums1) {
            ans[0] += s2[x];
        }
        for (int x : nums2) {
            ans[1] += s1[x];
        }
        return ans;
    }
}
