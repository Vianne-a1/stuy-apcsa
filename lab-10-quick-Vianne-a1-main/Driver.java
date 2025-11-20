public class Driver {
    public static void main(String[] args) {
        int[] arr1 = {8, 5, 6 ,7 ,92, 58, 5};
        int x1 = 2;

        System.out.println("Original Array 1:");
        printArray(arr1);

        System.out.println("\nResult of quickSelect 1:");
        int result1 = Quick.quickSelect(arr1.clone(), x1-1, 0, arr1.length - 1);
        System.out.println("The " + (x1) + "th smallest element is: " + result1);

        System.out.println("\nArray after quickSort 1:");
        int[] sortedArr1 = arr1.clone();
        Quick.quickSort(sortedArr1, 0, sortedArr1.length - 1);
        printArray(sortedArr1);

        System.out.println("\n----------------------------------------------------------\n");

        int[] arr2 = {30000, 000000000, -90000000, -1000000, 5000000, 400000000, -200000000};
        int x2 = 4;

        System.out.println("Original Array 2:");
        printArray(arr2);

        System.out.println("\nResult of quickSelect 2:");
        int result2 = Quick.quickSelect(arr2.clone(), x2-1, 0, arr2.length - 1);
        System.out.println("The " + (x2) + "th smallest element is: " + result2);

        System.out.println("\nArray after quickSort 2:");
        int[] sortedArr2 = arr2.clone();
        Quick.quickSort(sortedArr2, 0, sortedArr2.length - 1);
        printArray(sortedArr2);

        System.out.println("\n------------------------------------------------------------\n");

        int[] arr3 = {3, 14, 15, 92, 653, 5897, 9323, 84626}; //it's pi without the point lol
        int x3 = 3;

        System.out.println("Original Array 3:");
        printArray(arr3);

        System.out.println("\nResult of quickSelect 3:");
        int result3 = Quick.quickSelect(arr3.clone(), x3-1, 0, arr3.length - 1);
        System.out.println("The " + (x3) + "rd smallest element is: " + result3);

        System.out.println("\nArray after quickSort 3:");
        int[] sortedArr3 = arr3.clone();
        Quick.quickSort(sortedArr3, 0, sortedArr3.length - 1);
        printArray(sortedArr3);

        System.out.println("\n------------------------------------------------------------\n");

        int[] arr4 = {3, 1,4, 1,5, 9,2, 6,5,3, 5,8,9,7, 9,3,2,3, 8,4,6,2,6}; //it's pi without the point lol
        int x4 = 3;

        System.out.println("Original Array 4:");
        printArray(arr4);

        System.out.println("\nResult of quickSelect 4:");
        int result4 = Quick.quickSelect(arr4.clone(), x4-1, 0, arr4.length - 1);
        System.out.println("The " + (x4) + "rd smallest element is: " + result4);

        System.out.println("\nArray after quickSort 4:");
        int[] sortedArr4 = arr4.clone();
        Quick.quickSort(sortedArr4, 0, sortedArr4.length - 1);
        printArray(sortedArr4);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}