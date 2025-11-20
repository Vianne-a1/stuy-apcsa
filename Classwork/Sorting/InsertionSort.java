public class InsertionSort {
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

    public static void sort(int[] result) {
        for (int i = 1; i < result.length; i++) {
            int key = result[i];
            int j = i - 1;

            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                j = j - 1;
            }
            result[j + 1] = key;
        }
    }
}
