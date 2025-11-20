public class ArrayPractice {
    public static void main(String[] args) {
        int[][] array = {{3, 5, 7, 8, 0}, {500, 250, 125, 784, 267, 674, 0}, {9, 8, 0}};

        // Call the updateValue method three times on this array:
        updateValue(array, 0, array[0].length - 1, array.length);
        updateValue(array, 1, array[1].length - 1, array.length + array[1].length);
        updateValue(array, 2, array[2].length - 1, array[2][0] + array[2][array[2].length - 1]);

        // Print the modified array
        print(array);
    }

    // Create a method to add the correct value to the array at the correct col, row
    public static void updateValue(int[][] arr, int row, int col, int value) {
        arr[row][col] = value;
    }

    public static void print(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
