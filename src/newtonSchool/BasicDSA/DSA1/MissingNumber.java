package newtonSchool.BasicDSA.DSA1;

public class MissingNumber {
    public static void missingNum(int[] arr) {
        int k=arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != k+1){
                System.out.println(k+1);
                break;
            } else{
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int n= arr.length;
        missingNum(arr);
    }
}
