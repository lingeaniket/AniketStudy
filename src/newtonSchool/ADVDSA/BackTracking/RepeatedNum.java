package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class RepeatedNum {
    public static int array1(int[] arr, int idx, int K, int S) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == idx) {
                sum += K * arr[i];
            } else {
                sum += arr[i];
            }
        }
        if (sum == S) {
            return arr[idx];
        } else {
            idx++;
            return array1(arr, idx, K, S);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int K = sc.nextInt();
        int S= sc.nextInt();
        int count =0;
        int num=2;
        while(num<=N) {
            count++;
            num+=2;
        }
        int[] arr = new int[count];
        int no=2;
        for(int i=0; i<count; i++) {
            arr[i] = no;
            no+=2;
        }
        System.out.println(array1(arr, 0, K, S));
    }
}
