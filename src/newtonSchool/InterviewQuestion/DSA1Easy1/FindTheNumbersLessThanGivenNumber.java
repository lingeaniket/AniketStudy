package newtonSchool.InterviewQuestion.DSA1Easy1;

public class FindTheNumbersLessThanGivenNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {-1, -1, 5, 68, 98}; // Given By Interviewer
        int k=34; // Given by interviewer
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
