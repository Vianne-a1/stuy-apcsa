public class Sorts {

    public static void BubbleSort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // swap temp and arr[i]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

            // Print the status of the array after each outer loop iteration
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int value : data) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void SelectionSort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = data[minimumIndex];
            data[minimumIndex] = data[i];
            data[i] = temp;

            // Print the status of the array after each outer loop iteration
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int value : data) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void InsertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                // Shift elements
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;

            // Print the sorted array
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int value : data) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each iteration
        }
    }
}
