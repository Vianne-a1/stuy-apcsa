public class ChessBoard {
    public static void main(String[] args) {
        // Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];

        // Populate the first and last arrays with the correct chess pieces
        chess[0] = new String[]{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        chess[1] = new String[]{"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        chess[6] = new String[]{"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        chess[7] = new String[]{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};

        // Populate the rest of the arrays with "-"
        for (int i = 2; i < 6; i++) {
            chess[i] = new String[]{"-", "-", "-", "-", "-", "-", "-", "-"};
        }

        // Use the print method to print the chess board onto the console
        print(chess);
    }

    public static void print(String[][] array) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
