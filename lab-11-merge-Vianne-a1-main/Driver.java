import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        // This Driver was (partially) made by AI
        // Test merge method
        int[] left = { 1, 3, 5, 7, 9 };
        int[] right = {2, 4, 6, 8, 10};
        int[] merged = Merge.merge(left, right);
        System.out.println("Merged array: " + Arrays.toString(merged));

        // Test mergeSort method
        int[] data = {1, 9, 8, 3, 4, 0, 3, 5};
        System.out.println("Original array: " + Arrays.toString(data));
        int[] sorted = Merge.mergeSort(data);
        System.out.println("Sorted array: " + Arrays.toString(sorted));

        // The below is copy pasted and edited for further test cases
        System.out.println("--------------------------------------------------------------------");
        // Test merge method
        int[] left1 = { 3,1,4,1,5,9,2,6,5,3,5}; // pi :)
        int[] right1 = {0, 8, 2, 7, 2, 0, 0, 7};
        int[] merged1 = Merge.merge(left1, right1);
        System.out.println("Left array1: " + Arrays.toString(left1));
        System.out.println("Right array1: " + Arrays.toString(right1));
        System.out.println("Merged array1: " + Arrays.toString(merged1));
        System.out.println("Sorted array2: " + Arrays.toString(Merge.mergeSort(Merge.merge(left1, right1))));


        System.out.println("--------------------------------------------------------------------");

        // Test merge method
        int[] left2 = {5, 4, 3, 2, 1};
        int[] right2 = {6, 7, 8, 9, 10};
        int[] merged2 = Merge.merge(left2, right2);
        System.out.println("Merged array2: " + Arrays.toString(merged2));
        System.out.println("Sorted array2: " + Arrays.toString(Merge.mergeSort(merged2)));

        // Test mergeSort method
        int[] data2 = {25, 17, 39, 42, 13, 32, 21};
        System.out.println("Original array2: " + Arrays.toString(data2));
        int[] sorted2 = Merge.mergeSort(data2);
        System.out.println("Sorted array2: " + Arrays.toString(sorted2));
    }
}