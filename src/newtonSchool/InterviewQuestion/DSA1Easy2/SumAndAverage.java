package newtonSchool.InterviewQuestion.DSA1Easy2;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {-2,9,87,52,75,-26,-96,100};
        int n= arr.length;
        int sum =0;
        for(int i=0; i<n; i++) {
            sum+= sum+ arr[i];
        }
        double avrg = (double)sum/n;
        System.out.println(sum);
        System.out.println(avrg);
    }
}
