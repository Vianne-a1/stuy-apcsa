public class Stack {
  // This Stack class is designed for integer values >= 0

  // Instance variables here
  private Node head;
  private int size;

 // Constructor
  public Stack(){
      head = null;
      size = 0;
  }   

  // Add element to stack
  public void push(int value){
      Node newNode = new Node(value);
      if (isEmpty()) {
          head = newNode;
      } else {
          newNode.setNext(head);
          head = newNode;
      }
      size++;
  }

  // Remove element from stack  
  public int pop(){
      if (isEmpty()) {
          throw new IllegalStateException("Stack is empty");
      }
      int poppedValue = head.getData();
      head = head.getNext();
      size--;
      return poppedValue;
  }

  // Get top element
  public int peek(){
      if (isEmpty()) {
          throw new IllegalStateException("Stack is empty");
      }
      return head.getData();
  }

  // Check if stack is empty
  public boolean isEmpty(){
      return size == 0;
  }

  // Return size of stack
  public int size(){
      return size;
  }

  // Print stack
  public String toString(){
      StringBuilder sb = new StringBuilder();
      Node current = head;
      sb.append("Stack: ");
      while (current != null) {
          sb.append(current.getData()).append(" ");
          current = current.getNext();
      }
      return sb.toString();
  }
}
