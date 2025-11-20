import java.util.NoSuchElementException;
// idr smtg abt change item to null

public class MyDeque<E> {

  @SuppressWarnings("unchecked")

  // Instance variables
  private E[] data;
  private int size;
  private int start, end;

  // Constructors
  public MyDeque() {
    @SuppressWarnings("unchecked")
    E[] d = (E[]) new Object[10];
    data = d;
    size = 0;
    start = 0;
    end = 0;
  }

  public MyDeque(int initialCapacity) {
    @SuppressWarnings("unchecked")
    E[] d = (E[]) new Object[initialCapacity];
    data = d;
    size = 0;
    start = 0;
    end = 0;
  }

  // Add a new value on the indicated side
  public void addFirst(E element) {
    if (element == null) {
      throw new NullPointerException("Cannot add null element");
    }
    if (size == data.length) {
      resize();
    }
    start = (start - 1 + data.length) % data.length; // Adjust start index
    data[start] = element;
    size++;
  }

  public void addLast(E element) {
    if (element == null) {
      throw new NullPointerException("Cannot add null element");
    }
    if (size == data.length) {
      resize();
    }
    data[end] = element;
    end = (end + 1) % data.length; // Adjust end index
    size++;
  }

  // Remove and return the element
  public E removeFirst() {
    if (isEmpty()) {
        throw new NoSuchElementException("Deque is empty");
    }
    E removed = data[start];
    data[start] = null; 
    start = (start + 1) % data.length; 
    size--;
    return removed;
}

public E removeLast() {
    if (isEmpty()) {
        throw new NoSuchElementException("Deque is empty");
    }
    end = (end - 1 + data.length) % data.length;
    E removed = data[end];
    data[end] = null; 
    size--;
    return removed;
}


  // Return the element. Do not delete elements.
  public E getFirst() {
    if (isEmpty()) {
      throw new NoSuchElementException("Deque is empty");
    }
    return data[start];
  }

  public E getLast() {
    if (isEmpty()) {
      throw new NoSuchElementException("Deque is empty");
    }
    return data[(end - 1 + data.length) % data.length];
  }

  // Return deque size
  public int size() {
    return size;
  }

  // Resize the array. Double its length (data.length * 2)
  private void resize() {
    int newCapacity = data.length * 2;
    E[] newData = (E[]) new Object[newCapacity]; 
    for (int i = 0; i < size; i++) {
      newData[i] = data[(start + i) % data.length];
    }
    data = newData;
    start = 0;
    end = size;
  }

  // Return the deque as string in the correct order
  // Ex.: "[hello, my, dear, friends!]" where hello is the value at start index
  // and friends! is the value at end index
  public String toString() {
    if (isEmpty()) {
      return "[]";
    }
    StringBuilder result = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
      result.append(data[(start + i) % data.length]);
      if (i < size - 1) {
        result.append(", ");
      }
    }
    result.append("]");
    return result.toString();
  }

// Helper method for toString
  private boolean isEmpty() {
    return size == 0;
  }
}
