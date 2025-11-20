public class Driver {
    public static void main(String[] args) {
        // Create an instance of NQueens with a chessboard size of 4x4
        NQueens nQueens = new NQueens(4);

        // Solve the N-Queens problem
        nQueens.solve();

        // Display the solved board
        System.out.println("Solved N-Queens Board:");
        System.out.println(nQueens.toString());
    }
}
