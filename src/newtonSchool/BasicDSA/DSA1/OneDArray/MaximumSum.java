package newtonSchool.BasicDSA.DSA1.OneDArray;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        long[] arr= new long[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(maxSumArray(arr));
    }

    private static long maxSumArray(long[] arr) {
        long sum=0;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] >=0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
