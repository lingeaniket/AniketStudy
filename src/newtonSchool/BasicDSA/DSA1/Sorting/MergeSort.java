package newtonSchool.BasicDSA.DSA1.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSortUtil(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergeSortUtil(int[] arr, int low, int high){
        if(low>= high){
            return;
        }
        int mid =(low+high)/2;
        mergeSortUtil(arr, low, mid);
        mergeSortUtil(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int n= mid-low+1;
        int m= high-mid;
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=low, j=0; i<=mid; i++, j++){
            arr1[j] = arr[i];
        }
        for(int i=mid+1, j=0; i<=high; i++, j++){
            arr2[j] = arr[i];
        }

        int [] mergedArray = mergeTwoArr(arr1, arr2);
        for(int i=low, j=0; j<mergedArray.length; i++, j++){
            arr[i] = mergedArray[j];
        }
    }

    public static int[] mergeTwoArr(int[] arr1, int[] arr2){
        int n= arr1.length;
        int m= arr2.length;
        int[] newArr = new int[n+m];
        int idx =0;
        int ptr1= 0;
        int ptr2=0;
        while(ptr1 < n && ptr2 < m){
            if(arr1[ptr1] < arr2[ptr2]){
                newArr[idx++] = arr1[ptr1];
                ptr1++;
            } else {
                newArr[idx++] = arr2[ptr2];
                ptr2++;
            }
        }

        while(ptr1< n){
            newArr[idx++] = arr1[ptr1];
            ptr1++;
        }
        while(ptr2 < m){
            newArr[idx++] = arr2[ptr2];
            ptr2++;
        }

        return newArr;
    }
}
