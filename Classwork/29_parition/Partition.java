public static int partition(int[] data, int start, int end) {
    int p = (int) (Math.random() * (end - start + 1) + start);
    int pivot = data[p];

    // Swap pivot with the element at the start
    data[p] = data[start];
    data[start] = pivot;

    int i = start + 1;

    for (int j = start + 1; j <= end; j++) {
        if (data[j] < pivot) {
            // Swap elements at i and j
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
        }
    }

    // Swap pivot with the final position
    data[start] = data[i - 1];
    data[i - 1] = pivot;

    return i - 1;
}

// Partition

/*
 * Partition
 * 
 * When does your method end, swap the pivot to the correct position and return
 * this position?
 * Test your method
 * 
 * Test on the entire array.
 * 
 * Example:
 * myArray before partition: [123, 234, 98, 1, 2, 10, 5, 100, 2, 20]
 * Call partition method: partition(myArray, 0, myArray.length-1)
 * Selected pivot 98 at position 2 (original position)
 * Index of pivot after partition: 6
 * myArray array after partition: [5, 20, 2, 1, 2, 10, 98, 100, 123, 234]
 * 
 * Test your code on a section of your array.
 * 
 * Example:
 * myArray before partition: [123, 234, 98, 1, 2, 10, 5, 100, 2, 20]
 * Call partition method: partition(myArray, 2, 7)
 * Selected pivot 98 at position 2 (original position)
 * Index of pivot after the partition: 6
 * myArray after partition: [123, 234, 5, 1, 2, 10, 98, 100, 2, 20]
 * 
 * 
 */