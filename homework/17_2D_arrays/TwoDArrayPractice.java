public class TwoDArrayPractice
{

public static void main(String[] args)
{
    // Test case 1: rowSwap
    int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Before rowSwap:");
    print(array1);
    rowSwap(array1, 0, 2);
    System.out.println("After rowSwap:");
    print(array1);

    // Test case 2: colSwap
    int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("\nBefore colSwap:");
    print(array2);
    colSwap(array2, 0, 2);
    System.out.println("After colSwap:");
    print(array2);

    // Test case 3: fillRows
    System.out.println("\nfillRows:");
    String[][] result = fillRows("Happy Halloween", 3, 4);
    print(result);

    // Test case 4: fillRows with a shorter string
    System.out.println("\nfillRows with a shorter string:");
    String[][] resultShort = fillRows("hello", 3, 4);
    print(resultShort);
}

// Print method to avoid duplicated code
public static void print(int[][] array)
{
    for (int[] row : array) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// Print method for String arrays
public static void print(String[][] array)
{
    for (String[] row : array) {
        for (String value : row) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}

  
    /*
     * Swaps all values in the specified 2 rows of array.
    */
public static void rowSwap(int[][] array, int rowAIndex, int rowBIndex)
{
    int[] temp = array[rowAIndex];
    array[rowAIndex] = array[rowBIndex];
    array[rowBIndex] = temp;
}

    /**
     * Swaps all values in the specified 2 columns of array.
     */
public static void colSwap(int[][] array, int colAIndex, int colBIndex)
{
    for (int i = 0; i < array.length; i++) {
        int temp = array[i][colAIndex];
        array[i][colAIndex] = array[i][colBIndex];
        array[i][colBIndex] = temp;
    }
}

  
    /*
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.

     Examples:

      String[][] result = fillRows("Happy Halloween", 3, 4);
      
      result (after method call):
      "H"     "a"     "p"     "p"
      "y"     " "     "H"     "a"
      "l"     "l"     "o"     "w"
      
      
      String[][] result = fillRows("hello", 3, 4);
      
      result (after method call):
      "h"     "e"     "l"     "l"
      "o"     null    null    null
      null    null    null    null

     */
public static String[][] fillRows(String str, int rows, int cols)
{
    String[][] result = new String[rows][cols];
    int index = 0;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (index < str.length()) {
                result[i][j] = String.valueOf(str.charAt(index));
                index++;
            } else {
                result[i][j] = null;
            }
        }
    }
    return result;
}

  
}    
