/**
*@return true when the queen added correctly, false Otherwise
*@precondition r and c are valid indices of the board array
*@postcondition the board is only changed when the function returns true
* in which case the queen is added and all it's threatened positions are incremented.
*/
private boolean addQueen(...){

}

/**Remove the queen that was added to r,c
*@precondition r and c are valid indices of the board array and there is a queen at position r,c
*@postcondition the board is modified to remove that queen and all it's
*threatened positions are decremented
*/
private void removeQueen(...){

}

Initialize the Chessboard:
Create an NxN 2D array (chessboard) with default values of 0.
Place Queens Recursively:
Start placing queens column by column.
For each column, try each row.
If valid, mark as queen (-1).
Check Validity and Update Threatened Positions:
Ensure no other queen in the same row, column, or diagonal.
Update threatened positions.
Backtrack and Remove Queens:
If invalid, backtrack.
Remove queen and update threatened positions.
Repeat Until Solution or Exhausted:
Explore all possibilities.
Remove Queen When No Empty Positions:
Backtrack if no empty cells left.


private boolean addQueen(int[][] board, int row, int col) {
    if (!isSafe(board, row, col)) return false;
    board[row][col] = -1;
    updateThreatenedPositions(board, row, col, 1);
    return true;
}

private void removeQueen(int[][] board, int row, int col) {
    board[row][col] = 0;
    updateThreatenedPositions(board, row, col, -1);
}

private boolean isSafe(int[][] board, int row, int col) {
    // Check row, column, and diagonals
    // ...
}

private void updateThreatenedPositions(int[][] board, int row, int col, int delta) {
    // Update threatened positions
    // ...
}
