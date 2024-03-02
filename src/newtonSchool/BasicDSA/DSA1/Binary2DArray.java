package newtonSchool.BasicDSA.DSA1;

import java.util.Scanner;

public class Binary2DArray {
    static int[][] printRow(int[][] arr, int i) {
        for(int m=0; m<arr[0].length; m++) {
            arr[i][m] = 1;
        }
        return arr;
    }
    static void printArray(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == 1) {
                    printRow(arr, i);
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][M];
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            printArray(arr);
        }


    }
}
