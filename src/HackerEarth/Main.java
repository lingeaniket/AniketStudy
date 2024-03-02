package HackerEarth;

import java.util.Scanner;

public class Main {

    public static void bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=1; j<arr.length - i; j++){
                if(arr[j]< arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curVal =arr[i];
            int j=i-1;
            while(j>=0 && arr[j]> curVal){
                arr[j+1] = arr[j--];
            }
            arr[j+1] = curVal;
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]< arr[idx]){
                    idx = j;
                }
            }
            swap(arr, i, idx);
        }
    }

    public static void mergeSort(int[] arr){
        int length = arr.length;
        if(length< 2){
            return;
        }
        int mid = length/2;

        int[] left = new int[mid];
        int[] right = new int[length -mid];
        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i=mid; i<length; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);


    }

    public static void merge(int[] arr, int[] left, int[] right){
        int i=left.length, j=right.length, n=0, m=0, k=0;

        while(n<i && m<j){
            if(left[n]>= right[m]) {
                arr[k++] = right[m++];
            } else {
                arr[k++] = left[n++];
            }
        }
        while(n<i){
            arr[k++] = left[n++];
        }
        while(m<j){
            arr[k++] = right[m++];
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int pivot = arr[high];
        int left = low, right = high;

        while(left<right){
            while(arr[left]<= pivot && left < right){
                left++;
            }

            while(arr[right]>=pivot && left<right){
                right--;
            }

            swap(arr, left, right);
        }

        swap(arr, left, high);
        quickSort(arr, low, left-1);
        quickSort(arr, left+1, high);
    }

    public static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
//        bubbleSort(arr);
//        insertionSort(arr);
//        selectionSort(arr);
//        mergeSort(arr);
        quickSort(arr, 0, n-1);
        System.out.print("[")
        ;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
