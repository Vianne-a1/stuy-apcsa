public class Queue {
  // This Queue class is designed for integer values >= 0
  
  // Place private instance variables here 
  private Node head;
  private int size;

  // Place constructors here
  public Queue(){
      head = null;
      size = 0;
  }

  
  // Enqueue a new value to the queue
  public void enqueue(int value){
      Node newNode = new Node(value);
      if (isEmpty()) {
          head = newNode;
      } else {
          Node current = head;
          while (current.getNext() != null) {
              current = current.getNext();
          }
          current.setNext(newNode);
      }
      size++;
  }

   
  // Dequeue a value from the queue
  public int dequeue(){
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      int dequeuedValue = head.getData();
      head = head.getNext();
      size--;
      return dequeuedValue;
  }

  // Return the front/top
  public int peek(){
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      return head.getData();
  }


  // Check if queue is empty
  public boolean isEmpty(){
      return size == 0;
  }

  // Return queue size
  public int size(){
      return size;
  }

  
  // Print queue
  public String toString(){
      StringBuilder sb = new StringBuilder();
      Node current = head;
      sb.append("Queue: ");
      while (current != null) {
          sb.append(current.getData()).append(" ");
          current = current.getNext();
      }
      return sb.toString();
  }
}
