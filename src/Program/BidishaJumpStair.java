package Program;

public class BidishaJumpStair {
    public static boolean isJumpValid(int[] arr, int idx) {
        if(idx>= arr.length) {
            return false;
        } else if(idx== arr.length-1) {
            int j= arr[idx];
            return true;
        }
        int m= idx;
        int k= arr[m];
        idx = m +arr[m];
        return isJumpValid(arr, idx);
    }
    public static void main(String[] args) {
        int[] stair = {1, 4, 8, 2, 5, 6, 7};
        System.out.println(isJumpValid(stair,0));
    }
}
