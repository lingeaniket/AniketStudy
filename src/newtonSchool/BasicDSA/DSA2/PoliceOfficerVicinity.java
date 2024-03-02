package newtonSchool.BasicDSA.DSA2;

import java.util.Scanner;

public class PoliceOfficerVicinity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int northDist = sc.nextInt();
        int eastDist = sc.nextInt();
        int intX = sc.nextInt();
        int intY = sc.nextInt();
        int numBarriers = sc.nextInt();
        int[][] barriers = new int[numBarriers][2];
        for (int i = 0; i < numBarriers; i++) {
            barriers[i][0] = sc.nextInt();
            barriers[i][1] = sc.nextInt();
        }

        // Generate grid of points
        boolean[][] grid = new boolean[northDist+1][eastDist+1];
        for (int i = 0; i <= northDist; i++) {
            for (int j = 0; j <= eastDist; j++) {
                if (i % 1 == 0 && j % 1 == 0) {
                    grid[i][j] = true;
                }
            }
        }

        // Mark invalid points
        for (int i = 0; i < numBarriers; i++) {
            int bx = barriers[i][0];
            int by = barriers[i][1];
            for (int j = 0; j <= northDist; j++) {
                for (int k = 0; k <= eastDist; k++) {
                    if (Math.sqrt((bx-k)*(bx-k) + (by-j)*(by-j)) <= 1.0) {
                        grid[j][k] = false;
                    }
                }
            }
        }

        // Count valid points in vicinity of intersection
        int vicinitySum = 0;
        for (int i = Math.max(0, intX-8); i <= Math.min(northDist, intX+8); i++) {
            for (int j = Math.max(0, intY-8); j <= Math.min(eastDist, intY+8); j++) {
                if (grid[i][j] && Math.sqrt((intX-j)*(intX-j) + (intY-i)*(intY-i)) <= 8.0) {
                    vicinitySum++;
                }
            }
        }

        System.out.println(vicinitySum);
    }
}