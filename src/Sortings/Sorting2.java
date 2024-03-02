package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        bubbleSort(arr);
//        insertionSort(arr);
//        selectionSort(arr);
//        mergeSort(arr);
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j-1, j);
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curVal = arr[i];
            int j=i-1;
            while(j >=0 && arr[j] > curVal){
                arr[j+1] = arr[j--];
            }
            arr[j+1] = curVal;
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int idx=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            swap(arr, idx, i);
        }
    }

    public static void mergeSort(int[] arr){
        int length = arr.length;

        if(length < 2) return;
        int mid = length/2;

        int[] left = new int[mid];
        int[] right = new int[length-mid];

        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }

        for(int j=mid; j<length; j++){
            right[j-mid] = arr[j];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right){
        int l = left.length, r= right.length, i=0, j=0, k=0;

        while(i<l && j <r){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while(i<l){
            arr[k++] = left[i++];
        }
         while (j<r){
             arr[k++] = right[j++];
         }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>= high) return;
        int pivot= arr[high]; // 1

        int left = low, right = high; // 0 4
        while(left < right){ // T
            while (arr[left] <= pivot && left < right){ // F
                left++; // 0
            }
            while(arr[right] >= pivot && left < right){ // T
                right--; // 1
            }

            swap(arr, left, right); // 4 5 3 2 1
        }
        swap(arr, left, high); // 1 5 3 2 4

        quickSort(arr, low, left-1); // 1 5 3 2 4, 0 -1
        quickSort(arr, left+1, high); // 1 5 3 2 4 1 4
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
