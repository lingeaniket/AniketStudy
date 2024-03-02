package newtonSchool.BasicDSA.DSA1;

public class IntToChar {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,12,15,14,5,6};
        String str="";
        for(int i=0; i<arr.length; i++) {
            str += String.valueOf(arr[i]);
        }
        System.out.println(str);
    }
}
