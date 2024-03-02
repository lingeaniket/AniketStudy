package newtonSchool.InterviewQuestion.DSAHard1;

public class BinarySearch1 {
    public static int binarySearch(int[] arr, int low, int high) {
        int n=0;
        if(arr[low] == arr[high]) {
            return n;
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    n = arr[mid];
                    break;
                } else if (arr[mid] < arr[mid + 1]) {
                    if (arr[mid] > arr[0]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {

                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {8,8, 7, 7, 8, 8,8,8,8,8,8};
        int n= arr.length;
        int f1= binarySearch(arr, 0, n-1);
        int f2= arr[n-1];
        if(f1 == 0) {
            System.out.println("the peak element is " + f2);
        } else if(f1 == f2) {
            System.out.println("the peak element is " + f1);
        } else {
            System.out.print("the peak elemnt is " + f1 + "(or " + f2 +")");
        }
    }
}
