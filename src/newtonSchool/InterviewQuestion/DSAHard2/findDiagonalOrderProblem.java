package newtonSchool.InterviewQuestion.DSAHard2;

public class findDiagonalOrderProblem {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] answer = new int[n * m];
        int col = 0, row = 0;

        for (int i = 0; i < m * n; i++) {

            answer[i] = mat[row][col];

            if ((row + col) % 2 == 0) { // go up to the right

                if (col == n - 1)
                    row++;
                else if (row == 0)
                    col++;
                else {
                    row--;
                    col++;
                }
            } else {  // go down to the left

                if (row == m - 1)
                    col++;
                else if (col == 0)
                    row++;
                else {
                    row++;
                    col--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = findDiagonalOrder(mat);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
