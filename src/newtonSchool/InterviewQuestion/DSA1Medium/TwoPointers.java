package newtonSchool.InterviewQuestion.DSA1Medium;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr ={ 1, 2 ,2};
        int num=4;
        int ptr1= 0;
        int ptr2=arr.length-1;
        int count=0;
        while(ptr1<ptr2) {
            if(arr[ptr1] + arr[ptr2] == num) {
                count++;
                break;
            } else if(arr[ptr1] + arr[ptr2] > num) {
                ptr2--;
            } else{
                ptr1++;
            }
        }
        if(count !=0) {
            System.out.print("1");
        } else{
            System.out.print("0");
        }
    }
}
