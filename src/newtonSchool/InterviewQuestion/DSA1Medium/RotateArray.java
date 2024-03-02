package newtonSchool.InterviewQuestion.DSA1Medium;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        /*4 3 2 1
            3 4 --- 3 4 1 2
            1 2
         */
        int num=2;
        int n= arr.length;
        while(num>0) {
            int first= arr[n-1];
            //int second = arr[n-2];
            for(int i=n-1; i>0; i--) { // 2
                //System.out.println(arr[i] + " "+ arr[i-1]);
                arr[i] = arr[i-1];
                //1
            }
            arr[0] = first;
            num--;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
