package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class StrictlyIncreasing2 {
    public static boolean isIncreasing(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] newArrayForm(int[] arr, int idx, int lIdx) {
        if(idx>= arr.length) {
            return arr;
        }
        for(int i=1; i<=arr[idx]; i++) {
            if(arr[idx]%i==0 && arr[idx-1] < i) {
                arr[idx] = i;
                lIdx= i;
                break;
            }
        }
        return newArrayForm(arr, ++idx, ++lIdx);
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = newArrayForm(arr, 1, arr[0]);
        if(isIncreasing(newArr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
