package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static int num(int[] arr, int maxIdx, int sum, int count) {
        if(maxIdx<0 || sum==0) {
            return count;
        }
        int count1=count;
        for(int i=1; i<=maxIdx; i++) {
            if(arr[i] > sum) {
                count1++;
                maxIdx= i-1;
                break;
                //return num(arr, i-1, sum-arr[i-1], count);
            } else if (arr[i] == sum) {
                count1++;
                maxIdx = i;
                break;
            }
        }
        if(count1==count) {
            return num(arr, maxIdx, sum-arr[maxIdx], count+1);
        } else {
            return num(arr, maxIdx, sum - arr[maxIdx], count1);
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = {1,2,5,10,20,50,100,200,500,2000};
        while(T-->0) {
            int A= sc.nextInt();
            System.out.println(num(arr, arr.length-1, A, 0));
        }

    }
}
