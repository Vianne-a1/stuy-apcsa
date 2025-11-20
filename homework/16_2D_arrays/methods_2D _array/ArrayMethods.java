public class ArrayMethods {
    public static void main(String[] args) {
        // Test cases
        int[][] rectangularArray = {{8, 4, 2}, {1, 0, 9}, {5, 7, 8}};
        int[][] raggedArray = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int[][] emptyArray = {};

        // Test print method
        System.out.println("Printing rectangularArray:");
        print(rectangularArray);

        System.out.println("\nPrinting raggedArray:");
        print(raggedArray);

        System.out.println("\nPrinting emptyArray:");
        print(emptyArray);

        // Test findSum method
        int sumRectangular = findSum(rectangularArray);
        System.out.println("\nSum of elements in rectangularArray: " + sumRectangular);

        int sumRagged = findSum(raggedArray);
        System.out.println("Sum of elements in raggedArray: " + sumRagged);

        int sumEmpty = findSum(emptyArray);
        System.out.println("Sum of elements in emptyArray: " + sumEmpty);

        // Test transpose method
        int[][] transposedRagged = transpose(raggedArray);
        System.out.println("\nTransposed raggedArray:");
        print(transposedRagged);
    }

    public static void print(int[][] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int findSum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public static int[][] transpose(int[][] array) {
        int rows = array.length;
       

