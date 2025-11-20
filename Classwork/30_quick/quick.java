public class quick {
    public static int quickm (int[] data, int quick, int start, int end){
partition(data, start, end);
        return data[quick];
    }



public static int partition(int[] data, int start, int end) {
    int p = (int) (Math.random() * (end - start + 1) + start);
    int pivot = data[p];

    // Swap pivot with the element at the start
    data[p] = data[start];
    data[start] = pivot;

    int i = start + 1;

    for (int x = start + 1; x <= end; x++) {
        if (data[j] < pivot) {
            // Swap elements at i and j
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
         
        }
        return i;
    }

    // Swap pivot with the final position
    data[start] = data[i - 1];
    data[i - 1] = pivot;
}

public static void main(String[] args){
    int[] test = {1, 5, 5, 2, 3, 24};
    System.out.print(quickm(test, 2, 0, 9));
}
}