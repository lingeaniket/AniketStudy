package newtonSchool.InterviewQuestion.DSA1Medium;

import java.util.Scanner;

public class FindElementsWithGivenSum {
    public static boolean sum(int[] arr, int num) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int num= sc.nextInt();
        if(sum(arr, num)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
