public class ListNode {
  private String data;
  private ListNode next, prev;

  public ListNode(String d) {
      data = d;
      next = null;
      prev = null;
  }

  public String toString() {
      return data;
  }

  public String getData() {
      return data;
  }

  public ListNode next() {
      return next;
  }

  public ListNode prev() {
      return prev;
  }

  public String setData(String newdata) {
      String originalData = data;
      data = newdata;
      return originalData;
  }

  public void setNext(ListNode n) {
      next = n;
  }

  public void setPrev(ListNode n) {
      prev = n;
  }
}
