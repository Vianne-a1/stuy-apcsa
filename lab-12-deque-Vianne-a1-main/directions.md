### Directions to implement your ArrayDeque

- You must implement a generic ArrayDeque.
- The ArrayDeque size is the number of elements in the structure.
- The ArrayDeque capacity is the number of elements your ArrayDeque can hold before resize the array.
- All methods should have a complexity of 0(1), except toString() and resize().
- Resize the array when you try to add an element to any side and the array is at capacity. The resize method should double the capacity of the ArrayDeque and copy the values in the ArrayDeque over in the correct order.
- Throw an exception NoSuchElementException in the remove and get methods if ArrayDeque is empty.
- Throw an exception NullPointerException in methods add if the element you are trying to add is null.

In your Driver, you must create the objects like this:

```
    MyDeque<Integer> deque = new MyDeque<Integer>(10);
    MyDeque<String> deque = new MyDeque<String>(10);
```

Using a generic array requires that you create an array of Object, and then cast it to E. This causes a warning. Please use the following code to avoid that issue:
```
    public class MyDeque(){
      @SuppressWarnings("unchecked")
      E[] d = (E[])new Object[10];
      data = d;
    }
```
