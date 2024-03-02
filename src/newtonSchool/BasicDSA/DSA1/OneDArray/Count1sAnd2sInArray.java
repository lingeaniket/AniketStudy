package newtonSchool.BasicDSA.DSA1.OneDArray;

import java.util.Scanner;

public class Count1sAnd2sInArray {
    public static int[] count0sAnd1s(int[] arr) {
        int[] count = new int[2];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                count[0]++;
            } else {
                count[1]++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr= new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nArr= count0sAnd1s(arr);
        System.out.println(nArr[1] + " " +nArr[0]);
    }
}
