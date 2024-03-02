package newtonSchool.BasicDSA.DSA1.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class MaxFrequency {
    static int freq(int[] arr) {
        int n= arr.length;
        Arrays.sort(arr);
        int max_count = 1, res = n-1;
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                curr_count++;
                if (curr_count >= max_count) {
                    max_count = curr_count;
                    res = i - 1;
                }
            }
            else{
                curr_count = 1;
            }
        }
        return arr[res];
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(freq(arr));
    }
}
