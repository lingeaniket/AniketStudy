package newtonSchool.BasicDSA.DSA1.Sorting;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        insertionsort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
    public static void insertionsort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1]  = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
