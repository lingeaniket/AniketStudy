package LeetCodeProblems.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();;
        }

        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr){
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        int max= Integer.MIN_VALUE;
//        int repeat = 0;
//
//        for(int i=0; i<arr.length; i++){
//                hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
//                if(hm.get(arr[i]) > repeat){
//                    repeat = hm.get(arr[i]);
//                    max = arr[i];
//                } else if (hm.get(arr[i]) == repeat && arr[i] > max) {
//                    max= arr[i];
//                }
//
//        }
//        return max;

        return method(arr,0,arr[0]);
    }

    static int method(int v[],int ind,int ref)
    {
        int cnt=0;
        for(int i=ind;i<v.length;i++)
        {
            if(v[i]==ref)
                cnt++;
            else cnt--;
            if(cnt==-1)
                return method(v,i,v[i]);
        }
        return ref;
    }



}
