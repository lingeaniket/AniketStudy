package newtonSchool.InterviewQuestion.DSA1Easy1;

public class Sorting {
    // Sorting Array by two Pointers
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main (String[] args) {
        int[] arr = new int[] {2, 8 ,6 ,9, 1, 3};
        int ptr1= 0;
        int ptr2=1;
        while(ptr1<arr.length-1) {
            for (ptr2 = ptr1 + 1; ptr2 < arr.length; ptr2++) {
                if (arr[ptr1] > arr[ptr2]) {
                    swap(arr, ptr1, ptr2);
                }
            }
            ptr1++;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
