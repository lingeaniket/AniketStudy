package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println("Before: "+Arrays.toString(arr));
//        bubbleSort(arr);
//        insertionSort(arr);
//        selectionSort(arr);
//        mergeSort(arr);
        quickSort(arr, 0, n-1);
        System.out.println("After: "+Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            boolean swap = false;
            for(int j=1; j< arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    swap = true;
                    swap(arr, j, j-1);
                }
            }
            if(!swap) {
                break;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int small = arr[i];
            int j= i-1;
            while(j >=0 && arr[j] > small) {
                arr[j+1] = arr[j--];
            }
            arr[j+1] = small;
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int idx = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]< arr[idx]) {
                    idx = j;
                }
            }
            swap(arr, i, idx);
        }
    }

    public static void mergeSort(int[] arr) {
        int length = arr.length;

        if(length<2){
            return;
        }

        int mid =length/2;
        int[] left = new int[mid], right = new int[length-mid];

        for(int i=0; i< mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < length ; i++) {
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);

    }
    public static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length, r = right.length;
        int i=0, j=0, k=0;

        while(i < l && j < r ) {
            if(left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < l){
            arr[k++] = left[i++];
        }

        while (j < r){
            arr[k++] = right[j++];
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int pivot = arr[high];
        int left = low;
        int right = high;

        while (left < right) {
            while(arr[left] <= pivot && left < right) {
                left++;
            }

            while (arr[right] >= pivot && left < right) {
                right--;
            }

            swap(arr, left, right);
        }

        swap(arr, left, high);
        quickSort(arr, low, left-1);
        quickSort(arr, left+1, high);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
