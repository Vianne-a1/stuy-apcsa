import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Silver {

    public static long solve(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        int N = input.nextInt();
        int M = input.nextInt();
        int T = input.nextInt();
        char[][] pasture = new char[N][M];
        for (int i = 0; i < N; i++) {
            pasture[i] = input.next().toCharArray();
        }
        int R1 = input.nextInt() - 1;
        int C1 = input.nextInt() - 1;
        int R2 = input.nextInt() - 1;
        int C2 = input.nextInt() - 1;
        long[][][] dp = new long[T + 1][N][M];
        dp[0][R1][C1] = 1;
        for (int t = 0; t < T; t++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                        int nr = r + d[0];
                        int nc = c + d[1];
                        if (nr >= 0 && nr < N && nc >= 0 && nc < M && pasture[nr][nc] == '.') {
                            dp[t + 1][nr][nc] += dp[t][r][c];
                        }
                    }
                }
            }
        }
        return dp[T][R2][C2];
    }

    public static void main(String[] args) {
        try {
            String filename = "files/ctravel.2.in";
            System.out.println("There are only " +  solve(filename) + " ways to go from your start point to your end point.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
