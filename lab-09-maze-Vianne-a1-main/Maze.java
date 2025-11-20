import java.util.*;
import java.io.*;

public class Maze {
    private char[][] maze;
    private boolean animate;
    private int startRow, startCol;

    public Maze(String filename) throws FileNotFoundException {
        try {
            Scanner mazeScanner = new Scanner(new File(filename));

            // Read maze from file
            List<String> lines = new ArrayList<>();
            while (mazeScanner.hasNextLine()) {
                String line = mazeScanner.nextLine();
                lines.add(line);
            }

            int numRows = lines.size();
            int numCols = lines.get(0).length();

            maze = new char[numRows][numCols];

            // Populate the maze array
            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    maze[row][col] = lines.get(row).charAt(col);
                    if (maze[row][col] == 'S') {
                        startRow = row;
                        startCol = col;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + filename);
        }
    }

    /**
     * toString
     *
     * @return the string that represents the maze.
     * It should look like the text file with some characters potentially replaced.
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                result.append(maze[row][col]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    /**
     * Wrapper Solve Function returns the helper function
     *
     * @return the result of the recursive solve.
     */
    public int solve() {
        return solve(startRow, startCol);
    }

    /**
     * Solve
     *
     * @param row row index
     * @param col column index
     * @return the number of '@' symbols from S to E when the maze is solved, or -1 when the maze has no solution.
     * @precondition the maze is rectangular and has a border of '#' around the edges.
     * @postcondition: The maze has been solved by marking a path of '@' symbols from S to E.
     * The 'S' is replaced with '@'
     * The 'E' remains the same
     * All visited spots that were not part of the solution are changed to '.'
     * All visited spots that are part of the solution are changed to '@'
     */
    private int solve(int row, int col) {
        // Base case: reached the end of the maze
        if (maze[row][col] == 'E') {
            return 0;
        }

        // Explore neighboring cells
        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            // Check if the new position is within bounds and a valid path
            if (isValidPath(newRow, newCol)) {
                // Mark the current position as part of the solution
                maze[row][col] = '@';

                // Recursive call to explore the next position
                int result = solve(newRow, newCol);

                // If a solution is found, return the total number of steps
                if (result >= 0) {
                    return result + 1;
                }
            }
        }

        // Unmark the current position if no solution is found from this path
        maze[row][col] = '.';

        return -1;  // No solution found from this position
    }

    /**
     * Helper function to check if a position is within bounds and a valid path
     */
    private boolean isValidPath(int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && (maze[row][col] == ' ' || maze[row][col] == 'E');
    }

    /*
     * Second part of this lab:
     * We will go over this method after you write the solve
     */
    /* Recursion will end when there are no more valid directions left to explore
     * from the current position ensuring that dead ends are reached.
     */


    private final static int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private final static Random RANDOM = new Random();
    
    public Maze(int rows, int cols) {
        maze = new char[rows][cols];
        for (char[] row : maze) {
            Arrays.fill(row, '#');
        }
        carveMaze(1, 1);
        addSE();
    }
    
    public void carveMaze(int row, int col) {
        List<int[]> directions = new ArrayList<>();
        for (int[] dir : DIRECTIONS) {
            directions.add(dir);
        }
    
        // Base Case
        if (isBorder(row, col) || hasMoreThanOneAdjacentSpace(row, col)) {
            return;
        }
    
        // Recursive Case
        // Change spot at (row, col) to a space
        maze[row][col] = ' ';
    
        // Shuffle the directions list
        Collections.shuffle(directions);
    
        // For each direction randomly selected => call carveMaze in that direction
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            carveMaze(newRow, newCol);
        }
    }
    
    private boolean isBorder(int row, int col) {
        return row == 0 || row == maze.length - 1 || col == 0 || col == maze[0].length - 1;
    }
    
    private boolean hasMoreThanOneAdjacentSpace(int row, int col) {
        int count = 0;
        for (int[] dir : DIRECTIONS) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValidPath(newRow, newCol) && maze[newRow][newCol] == ' ') {
                count++;
            }
        }
        return count > 1;
    }
    
    // Add 'S' and 'E' to the maze
    public void addSE() {
        // Find a random position for 'S' (start) and place it
        Random rand = new Random();
        startRow = rand.nextInt(maze.length - 2) + 1;
        startCol = rand.nextInt(maze[0].length - 2) + 1;
        maze[startRow][startCol] = 'S';
    
        // Find a random position for 'E' (end) and place it
        int endRow, endCol;
        do {
            endRow = rand.nextInt(maze.length - 2) + 1;
            endCol = rand.nextInt(maze[0].length - 2) + 1;
        } while (!isValidPath(endRow, endCol) || (endRow == startRow && endCol == startCol));
    
        maze[endRow][endCol] = 'E';
    }
    private int getRowChange(int direction) {
        return (direction == 2) ? 1 : (direction == 3) ? -1 : 0;
    }

    private int getColChange(int direction) {
        return (direction == 0) ? 1 : (direction == 1) ? -1 : 0;
    }

    private int countAdjacentSpaces(int row, int col) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int newRow = row + getRowChange(i);
            int newCol = col + getColChange(i);

            if (isValidPath(newRow, newCol) && maze[newRow][newCol] == ' ') {
                count++;
            }
        }
        return count;
    }

    private void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    /*
     * The following code will be used for animation.
     * Please do not change anything.
     */

    private void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }

    public void setAnimate(boolean b) {
        animate = b;
        if (animate) {
            gotoTop();
            clearTerminal();
            System.out.println(this);
            wait(200);
        }
    }

    public static void clearTerminal() {
        //erase terminal
        System.out.println("\033[2J");
    }

    public static void gotoTop() {
        //go to top left of screen
        System.out.println("\033[1;1H");
    }

}
