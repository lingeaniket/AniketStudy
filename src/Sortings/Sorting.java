package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
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

    public static void bubbleSort(int[] arr){
        int loop = 0;
        for(int i=0; i<arr.length; i++){
            loop++;
            boolean isSwapped = false;
            for(int j=1; j<arr.length-i; j++){
                loop++;
                if(arr[j-1]> arr[j]){
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
        System.out.println(loop);
    }

    public static void insertionSort(int[] arr) {
        // placing the element at its correct order in array
        for(int i=1; i<arr.length; i++){
            int currentVal = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > currentVal ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentVal;
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int idx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]< arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void mergeSort(int[] arr){
        int length = arr.length;
        if(length < 2) return;

        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i=mid;i<length; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right){
        int l = left.length, r= right.length;

        int i=0, j=0, k=0;

        while(i < l && j < r){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < l) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < r){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>= high) return;
        int pivot = arr[high];
        int leftPointer = low, rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer ){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, high);

        quickSort(arr, low, leftPointer-1);
        quickSort(arr, leftPointer+1, high);
    }

    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
