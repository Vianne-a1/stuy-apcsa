
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        int[] originalArray = generateRandomArray(10);

        System.out.println("Original Array:");
        printArrayStatus(originalArray);

        System.out.println("\nSorting with Bubble Sort:");
        int[] arrayForBubbleSort = Arrays.copyOf(originalArray, originalArray.length);
        Sorts.BubbleSort(arrayForBubbleSort);

        System.out.println("\nSorting with Selection Sort:");
        int[] arrayForSelectionSort = Arrays.copyOf(originalArray, originalArray.length);
        Sorts.SelectionSort(arrayForSelectionSort);

        System.out.println("\nSorting with Insertion Sort:");
        int[] arrayForInsertionSort = Arrays.copyOf(originalArray, originalArray.length);
        Sorts.InsertionSort(arrayForInsertionSort);
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Adjust the range as needed
        }
        return array;
    }

    private static void printArrayStatus(int[] array) {
        System.out.println("Array Status: " + Arrays.toString(array));
    }
}
