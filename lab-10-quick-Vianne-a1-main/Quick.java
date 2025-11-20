public class Quick {
  
  public static int quickSelect(int[] data, int x, int start, int end) {
    if (start == end) {
      return data[start];
    }
    
    int pivotValue = partition(data, start, end);
    
    if (x == pivotValue) {
      return data[x];
    } else if (x < pivotValue) {
      return quickSelect(data, x, start, pivotValue - 1);
    } else {
      return quickSelect(data, x, pivotValue + 1, end);
    }
  }
  
  public static void quickSort(int[] data, int start, int end) {
    if (start < end) {
      int pivotValue = partition(data, start, end);
      quickSort(data, start, pivotValue - 1);
      quickSort(data, pivotValue + 1, end);
    }
  }
  
  public static int partition(int[] data, int start, int end) {
    int pivot = data[end];
    int i = start - 1;
    
    for (int j = start; j < end; j++) {
      if (data[j] < pivot) {
        i++;
        swap(data, i, j);
      }
    }
    
    swap(data, i + 1, end);
    return i + 1;
  }
  
  private static void swap(int[] data, int i, int j) {
    int temp = data[i];
    data[i] = data[j];
    data[j] = temp;
  }
  

}
