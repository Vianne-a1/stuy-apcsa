public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

    public static void merge(int[] destination, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                destination[k++] = left[i++];
            } else {
                destination[k++] = right[j++];
            }
        }

        while (i < left.length) {
            destination[k++] = left[i++];
        }
        while (j < right.length) {
            destination[k++] = right[j++];
        }
    }

    public static int[] mergeSort(int[] data) {
        if (data.length <= 1) {
            return data;
        }

        int mid = data.length / 2;
        int[] left = new int[mid];
        int[] right = new int[data.length - mid];

        System.arraycopy(data, 0, left, 0, mid);
        System.arraycopy(data, mid, right, 0, data.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }
}
