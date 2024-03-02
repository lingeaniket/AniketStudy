package newtonSchool.InterviewQuestion.DSA1Easy2;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        mergeUtil(arr, 0, arr.length-1);
    }
    public static void mergeUtil(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        int mid = (low+high)/2;

        mergeUtil(arr, low, mid);
        mergeUtil(arr, mid+1, high);

        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high) {
        int n= mid-low+1;
        int m = high-mid;
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=low, j=0; i<=mid; i++,j++) {
            arr1[j] = arr[i];
        }
        for(int i=mid+1, j=0; i<=high; i++,j++) {
            arr2[j] = arr[i];
        }
        int[] mergedArray = mergeTwo(arr1, arr2);

        for(int i=low, j=0; j<mergedArray.length; i++, j++) {
            arr[i] = mergedArray[j];
        }
    }
    public static int[] mergeTwo(int[] arr1, int[] arr2) {
        int n= arr1.length;
        int m= arr2.length;
        int[] mergeArray = new int[n+m];
        int ptr1=0;
        int ptr2=0;
        int index=0;
        while(ptr1<n && ptr2 <m) {
            if(arr1[ptr1] < arr2[ptr2]) {
                mergeArray[index++] = arr1[ptr1];
                ptr1++;
            } else {
                mergeArray[index++] = arr2[ptr2];
                ptr2++;
            }
        }
        while(ptr1<n) {
            mergeArray[index++] = arr1[ptr1];
            ptr1++;
        }
        while(ptr2<m) {
            mergeArray[index++] = arr2[ptr2];
            ptr2++;
        }

        return mergeArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,7,5,3,4};
        mergeSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
