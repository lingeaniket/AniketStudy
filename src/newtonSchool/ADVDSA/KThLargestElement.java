package newtonSchool.ADVDSA;

import java.util.Scanner;

public class KThLargestElement {
    public static int kThLargest(int[] arr, int K){
        int n= arr.length-K; // 5 3 , 2
        //int m= arr.length/2;// 2
        return arr[n];
    }
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j])
                    smallest = j;
            }
            swap(arr, i, smallest);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0) {
            int N= sc.nextInt();
            int K= sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            selectionSort(arr);
            System.out.print(kThLargest(arr, K));
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
