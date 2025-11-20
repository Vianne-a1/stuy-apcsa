public class Driver {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Driver <sortingMethod> <value1> <value2> ...");
            System.out.println("Sorting Methods: 1 (Selection Sort), 2 (Insertion Sort)");
            return;
        }

        int sortingMethod = Integer.parseInt(args[0]);
        int[] values = new int[args.length - 1];

        // Parse the values to be sorted
        for (int i = 1; i < args.length; i++) {
            values[i - 1] = Integer.parseInt(args[i]);
        }

        // Use the selected sorting method
        switch (sortingMethod) {
            case 1:
                // Selection Sort
                SelectionSort.sort(values);
                break;
            case 2:
                // Insertion Sort
                InsertionSort.sort(values);
                break;
            default:
                System.out.println("Invalid sorting method. Please choose 1 (Selection Sort) or 2 (Insertion Sort).");
                return;
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
