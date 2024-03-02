package newtonSchool.BasicDSA.DSA1.Sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionsort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int idx= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]< arr[j-1]) {
                    idx = j;
                }
            }
            int small = arr[idx];
            arr[idx] = arr[i];
            arr[i] = small;
        }
    }
}
