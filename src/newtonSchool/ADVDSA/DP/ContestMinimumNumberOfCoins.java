package newtonSchool.ADVDSA.DP;

import java.util.*;

public class ContestMinimumNumberOfCoins {
    public static int num(int[] arr, int mainIdx, int maxIdx, int mainSum, int sum, int count) {
        if(sum==0) {
            return count;
        } else if(maxIdx<0) {
            count=0;
            return count;
        } else if(sum<0) {
            count=0;
            maxIdx = mainIdx-1;
            mainIdx--;
            sum = mainSum;
            return num(arr, mainIdx, maxIdx, mainSum, sum, count);
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
            return num(arr, mainIdx, maxIdx, mainSum,sum-arr[maxIdx], count+1);
        } else {
            return num(arr, mainIdx, maxIdx, mainSum,sum - arr[maxIdx], count1);
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        //int[] arr = {1,2,5,10,20,50,100,200,500,2000};
        while(T-->0) {
            int A= sc.nextInt();
            int N= sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int number = num(arr, arr.length-1, arr.length-1, A, A, 0);
            if(number == 0) {
                System.out.println("Not Possible");
            } else {
                System.out.println(number);
            }
        }
    }
}
/*
1
10
4
2 3 5 6
 */
