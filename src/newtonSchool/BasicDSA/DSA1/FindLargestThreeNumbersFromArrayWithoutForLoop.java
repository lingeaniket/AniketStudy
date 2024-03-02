package newtonSchool.BasicDSA.DSA1;

public class FindLargestThreeNumbersFromArrayWithoutForLoop {
    public static void main(String[] args) {
        int[] arr = {75};
        int n= arr.length;
        int ptr1 = 0;
        int largest1=0;
        int index1=0;
        while(ptr1<arr.length) {
            if(arr[ptr1] > largest1) {
                largest1 = arr[ptr1];
                index1 = ptr1;
                ptr1++;
            } else{
                ptr1++;
            }
        }
        int ptr2=0;
        if(ptr2 == index1) {
            ptr2++;
        }
        int largest2=0;
        int index2=0;
        while(ptr2<arr.length) {
            if(ptr2 == index1) {
                ptr2++;
            } else if(arr[ptr2] > largest2) {
                largest2 = arr[ptr2];
                index2 = ptr2;
                ptr2++;
            } else{
                ptr2++;
            }
        }
        int ptr3=0;
        if(ptr3 == index1 || ptr3 == index2) {
            ptr3++;
        }
        int largest3=0;
        int index3=0;
        while(ptr3<arr.length) {
            if(ptr3 == index1 || ptr3 == index2) {
                ptr3++;
            } else if(arr[ptr3] > largest3) {
                largest3 = arr[ptr3];
                index3 = ptr3;
                ptr3++;
            } else{
                ptr3++;
            }
        }

        System.out.println(largest1+" "+ largest2+" "+ largest3);
    }
}
