package newtonSchool.BasicDSA.DSA1;

public class DoorProblem {
    public static long max(long[] arr){
        long maximum = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static int find(long[] arr, long el, int n) {
        int m=-1;
        for(int i=n; i<arr.length; i++) {
            if(arr[i] == el);
            m=i;
            break;
        }
        return m;
    }
    public static int tCount(long[] arr, long el, int n) {
        int count=0;
        for(int i=n; i<arr.length; i++) {
            if(arr[i] == el);
            count++;
        }
        return count;
    }
    public static long[] newArray(long[] arrival, int[] entry) {
        long[] newArr = new long[arrival.length];
        long m= max(arrival);
        long t=0;
        int index=0;
        long number=1;
        while(t == 0) {
            index = find(arrival, t, 0);
            if(entry[index] == 0) {
                int n= find(arrival, t, index+1);
                if(n ==-1) {
                    newArr[index] = number++;
                } else if(entry[index] == 1) {
                    newArr[n] = number++;
                }
            } else {
                newArr[index] = number++;
            }
            t--;

        }
        int newIdx;
        int count;
        for(int i=1; i<=t; i++) {
            count = tCount(arrival, i, 0);
            int index1;
            if(count==0) {
                continue;
            } else{
                index1 = find(arrival, i, 0);
                newIdx = index1;
            }
            while(count>0) {
                if(entry[newIdx] == entry[index]) {
                    newArr[newIdx] = number++;
                    index=newIdx;
                    count--;
                } else {

                }
                newIdx = find(arrival, i, index1+1);
            }

        }
        return newArr;
    }
    public static void main(String[] args) {

    }
}
