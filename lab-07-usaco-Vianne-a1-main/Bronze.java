import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bronze {

    public static long solve(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        int R = input.nextInt();
        int C = input.nextInt();
        int E = input.nextInt();
        int N = input.nextInt();
        int[][] pasture = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                pasture[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            int startRow = input.nextInt() - 1;
            int startColumn = input.nextInt() - 1;
            int stomp = input.nextInt();
            int max = Integer.MIN_VALUE;
            for (int r = startRow; r < startRow + 3; r++) {
                for (int c = startColumn; c < startColumn + 3; c++) {
                    max = Math.max(max, pasture[r][c]);
                }
            }
            int target = max - stomp;
            for (int r = startRow; r < startRow + 3; r++) {
                for (int c = startColumn; c < startColumn + 3; c++) {
                    if (pasture[r][c] > target) {
                        pasture[r][c] = target;
                    }
                }
            }
        }
        long volume = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                volume += Math.max(0, E - pasture[i][j]);
            }
        }
        input.close();
        return volume * 72 * 72;
    }

    public static void main(String[] args) {
        try {
            long result = solve("files/makelake.1.in");
            System.out.println("Volume of water in cubic inches: " + result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
