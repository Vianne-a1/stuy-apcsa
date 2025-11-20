public class NQueens {
    private int[][] board;

    public NQueens(int size) {
        board = new int[size][size];
    }

    private boolean isSafe(int row, int col) {
        // Check if the spot is safe for a queen to be placed
        for (int i = 0; i < row; i++) {
            if (board[i][col] == -1 ||                      // Check column
                board[i][col - (row - i)] == -1 ||          // Check upper left diagonal
                board[i][col + (row - i)] == -1) {          // Check upper right diagonal
                return false;
            }
        }
        return true;
    }

    private boolean addQueen(int row) {
        if (row == board.length) {
            return true; // All queens are placed successfully
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col)) {
                // Place queen
                board[row][col] = -1;

                // Go back and place the next queen
                if (addQueen(row + 1)) {
                    return true;
                }

                // If placing queen in the current spot doesn't lead to a solution, backtrack
                board[row][col] = 0;
            }
        }

        return false; // Couldn't place the queen in this row
    }

    private void removeQueen(int row, int col) {
        // Remove queen from the specified position and update threatened positions
        board[row][col] = 0;
        for (int i = row + 1; i < board.length; i++) {
            board[i][col]--;                 
            if (col - (i - row) >= 0) {
                board[i][col - (i - row)]--; 
            }
            if (col + (i - row) < board.length) {
                board[i][col + (i - row)]--;          
            }
        }
    }

    public void solve() {
        clearBoard();
        addQueen(0);
    }

    private void clearBoard() {
        // Clear the board and initialize threatened positions
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
    }

    public String toString() {
        // Implement toString() method as described
        StringBuilder result = new StringBuilder();
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == -1) {
                    result.append("Q ");
                } else {
                    result.append("_ ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
