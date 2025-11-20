public class SelectionSort {
    public static void main(String[] args) {
        int[] data = new int[args.length];
        for (int i = 0; i < args.length; i++) {
           data[i] = Integer.parseInt(args[i]);
        }
        sort(data);

        // Print the sorted array
        for (int value : data) {
            System.out.print(value + " ");
        }
    }

    public static void sort(int[] data) {
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
        }
    }
}
