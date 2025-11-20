public class SuperArray {

    private int[][] superArr;

    // Default constructor
    public SuperArray() {
        superArr = new int[6][7];
    }

    // Constructor with initial capacity
    public SuperArray(int initialCapacity) {
        superArr = new int[initialCapacity][7];
    }
}
