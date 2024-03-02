package newtonSchool.ADVDSA;

import java.util.*;
/*
5 6
1 2
1 3
2 3
2 4
4 3
3 5


3 2
1 3
2 3
 */
public class LexicographicallySmallestTopoOrder {
    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void smallOrder(int[][] arr, int N){
        int[] newAr= new int[N]; // 1 2 3 4 5
        for(int i=0; i<N; i++) {
            newAr[i] = i+1;
        }
        for(int i=0; i<N; i++) {
            int c= arr[i][0]; // c =1;
            int d= arr[i][1]; // d= 2;
            int idx1=0;
            int idx2=0;
            for(int j=0; j<N; j++) {
                if (newAr[j] == c) {
                    idx1 = j;
                    break;
                }
            }
            for(int j=0; j<N; j++) {
                if (newAr[j] == d) {
                    idx1 = j;
                    break;
                }
            }
            if(idx1 > idx2){
                swap(newAr, idx1, idx2);
            }
        }
        for(int i=0; i<N; i++) {
            System.out.println(newAr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] arr = new int[M][2];
        for(int i=0; i<M; i++) {
            for(int j=0; j<2; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        smallOrder(arr,N);
    }
}
