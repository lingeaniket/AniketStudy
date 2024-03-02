package newtonSchool.BasicDSA.DSA1;

import java.util.Scanner;

public class GFG {
        static int min(int a, int b)
        {
            return (a < b) ? a : b;
        }

        // A utility function to find min
        // of three integers
        static int min(int a, int b, int c)
        {
            return min(min(a, b), c);
        }

        // A utility function to find max
        // of two integers
        static int max(int a, int b)
        {
            return (a > b) ? a : b;
        }

        // The main function that prints given
        // matrix in diagonal order
        static void diagonalOrder(int[][] arr)
        {
            int ROW = arr.length;
            int COL = arr[0].length;

            // There will be ROW+COL-1 lines in the output
            for (int line = 1; line <= (ROW + COL - 1); line++){
                int start_col = max(0, line - ROW);
                int count = min(line, (COL - start_col), ROW);
                for (int j = 0; j < count; j++)
                    System.out.print(arr[min(ROW, line) - j- 1][start_col + j] + " ");
                System.out.println();
            }
        }

        // Utility function to print a matrix
        /*static void printMatrix(int matrix[][])
        {
            int ROW = matrix.length;
            int COL = matrix[0].length;
            for (int i = 0; i < ROW; i++)
            {
                for (int j = 0; j < COL; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.print("\n");
            }
        }
        */
        // Driver code
        public static void main(String[] args)
        {
            /*int M[][] = {
                    { 1, 2, 3, 4 },	 { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 }, { 13, 14, 15, 16 },
                    { 17, 18, 19, 20 },
            };
            System.out.print("Given matrix is \n");
            printMatrix(M);
            System.out.print(
                    "\nDiagonal printing of matrix is \n");
            diagonalOrder(M);
            */
            Scanner sc=new Scanner(System.in);
            int M = sc.nextInt();
            int N= sc.nextInt();
            int[][] arr = new int[M][N];
            for(int i=0; i<M; i++) {
                for(int j=0; j<N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            diagonalOrder(arr);
        }
    }
