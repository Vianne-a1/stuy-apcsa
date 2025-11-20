public class MyHeap {
    private int[] heap;
    private int size;
    private int maxsize;
    private boolean isMaxHeap;

    public MyHeap(int numElements, boolean isMax) {
        if (numElements <= 0) {
            throw new IllegalArgumentException("Number of elements must be positive");
        }
        maxsize = numElements;
        size = 0;
        heap = new int[maxsize];
        isMaxHeap = isMax;
    }

    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos + 1;
    }

    private int rightChild(int pos) {
        return 2 * pos + 2;
    }

    private void swap(int idx1, int idx2) {
        int temp = heap[idx1];
        heap[idx1] = heap[idx2];
        heap[idx2] = temp;
    }

    private boolean shouldSwap(int parent, int child) {
        return isMaxHeap ? heap[parent] < heap[child] : heap[parent] > heap[child];
    }

    private void heapifyUp(int pos) {
        int current = pos;
        while (current > 0 && shouldSwap(parent(current), current)) {
            swap(parent(current), current);
            current = parent(current);
        }
    }

    private void heapifyDown(int pos) {
        int current = pos;
        while (true) {
            int left = leftChild(current);
            int right = rightChild(current);
            int largest = current;

            if (left < size && shouldSwap(current, left)) {
                largest = left;
            }

            if (right < size && shouldSwap(largest, right)) {
                largest = right;
            }

            if (largest != current) {
                swap(current, largest);
                current = largest;
            } else {
                break;
            }
        }
    }

    public void insert(int element) {
        if (size >= maxsize) {
            throw new IllegalStateException("Heap is full.");
        }

        heap[size] = element;
        size++;
        heapifyUp(size - 1);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int deleteRoot() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty.");
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }

    public int[] heapSort() {
        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = deleteRoot();
        }
        return sortedArray;
    }

    public static void main(String[] arg)
    {
      	// This is a max heap

        MyHeap heap = new MyHeap(14, true);
        heap.insert(10);
        heap.insert(7);
        heap.insert(26);
        heap.insert(8);
        heap.insert(1);
        heap.insert(20);
        heap.insert(15);
        System.out.print(heap.heapSort());

        heap.print();
        System.out.println("The deleted value is " + heap.deleteRoot());
        heap.print();
    }
}
