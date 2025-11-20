public class MyLinkedList {
  private int size;
  private ListNode front, back;

  public MyLinkedList() {
      size = 0;
      front = null;
      back = null;
  }

  public int size() {
      return size;
  }

  public String get(int index) {
      if (index < 0 || index >= size) {
          throw new IndexOutOfBoundsException("Index out of bounds");
      }

      ListNode current = front;
      for (int i = 0; i < index; i++) {
          current = current.next();
      }
      return current.getData();
  }

  public boolean add(String e) {
      ListNode newNode = new ListNode(e);
      if (size == 0) {
          front = newNode;
          back = newNode;
      } else {
          back.setNext(newNode);
          newNode.setPrev(back);
          back = newNode;
      }
      size++;
      return true;
  }

  public String toString() {
      StringBuilder result = new StringBuilder("[");
      ListNode current = front;
      while (current != null) {
          result.append(current.getData());
          if (current.next() != null) {
              result.append(", ");
          }
          current = current.next();
      }
      result.append("]");
      return result.toString();
  }

  public String toStringReversed() {
      StringBuilder result = new StringBuilder("[");
      ListNode current = back;
      while (current != null) {
          result.append(current.getData());
          if (current.prev() != null) {
              result.append(", ");
          }
          current = current.prev();
      }
      result.append("]");
      return result.toString();
  }

  public void add(int index, String element) {
      if (index < 0 || index > size) {
          throw new IndexOutOfBoundsException("Index out of bounds");
      }

      if (index == size) {
          add(element); // Adding to the end, use the existing method
          return;
      }

      ListNode newNode = new ListNode(element);
      if (index == 0) {
          newNode.setNext(front);
          front.setPrev(newNode);
          front = newNode;
      } else {
          ListNode current = front;
          for (int i = 0; i < index - 1; i++) {
              current = current.next();
          }
          newNode.setNext(current.next());
          newNode.setPrev(current);
          current.setNext(newNode);
          newNode.next().setPrev(newNode);
      }
      size++;
  }

  public String set(int index, String value) {
      if (index < 0 || index >= size) {
          throw new IndexOutOfBoundsException("Index out of bounds");
      }

      ListNode current = front;
      for (int i = 0; i < index; i++) {
          current = current.next();
      }
      String oldValue = current.getData();
      current.setData(value);
      return oldValue;
  }

  public boolean contains(String element) {
      ListNode current = front;
      while (current != null) {
          if (current.getData().equals(element)) {
              return true;
          }
          current = current.next();
      }
      return false;
  }

  public String remove(int index) {
      if (index < 0 || index >= size) {
          throw new IndexOutOfBoundsException("Index out of bounds");
      }

      ListNode current = front;
      for (int i = 0; i < index; i++) {
          current = current.next();
      }

      if (size == 1) {
          front = null;
          back = null;
      } else if (index == 0) {
          front = current.next();
          front.setPrev(null);
      } else if (index == size - 1) {
          back = current.prev();
          back.setNext(null);
      } else {
          current.prev().setNext(current.next());
          current.next().setPrev(current.prev());
      }

      size--;
      return current.getData();
  }

  public boolean remove(String element) {
      ListNode current = front;
      while (current != null) {
          if (current.getData().equals(element)) {
              if (current == front) {
                  front = current.next();
                  if (front != null) {
                      front.setPrev(null);
                  }
              } else if (current == back) {
                  back = current.prev();
                  if (back != null) {
                      back.setNext(null);
                  }
              } else {
                  current.prev().setNext(current.next());
                  current.next().setPrev(current.prev());
              }
              size--;
              return true;
          }
          current = current.next();
      }
      return false;
  }
}
