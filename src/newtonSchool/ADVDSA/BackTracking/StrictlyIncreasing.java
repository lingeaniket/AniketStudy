package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class StrictlyIncreasing {
    public static int replaceByFact(int sec, int fir) {
        for(int i=2; i<sec; i++) {
            if(sec%i==0) {
                if(i>fir) {
                    return i;
                }
            }
        }
        return sec;
    }
    public static boolean isArrayInceasing(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isIncreasing(int[] arr) {
        arr[0] = replaceByFact(arr[0],1);
        for(int i=1; i<arr.length; i++) {
            if(arr[i] >= arr[i-1]) {
                arr[i] = replaceByFact(arr[i], arr[i-1]);
            }
        }
        return isArrayInceasing(arr);
    }


    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr= new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        if(isIncreasing(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
